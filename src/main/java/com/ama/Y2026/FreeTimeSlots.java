package com.ama.Y2026;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

record TimeSlot(LocalTime start, LocalTime end) {}

record DayTimeSlot(DayOfWeek day, List<TimeSlot> timeSlots) {}

public class FreeTimeSlots {
    List<DayTimeSlot> schedules = new ArrayList<>();
    List<DayTimeSlot> bookings = new ArrayList<>();
    int interval = 30;

    public FreeTimeSlots() {
        schedules.add(
                new DayTimeSlot(DayOfWeek.MONDAY, List.of(new TimeSlot(LocalTime.of(10, 0), LocalTime.of(13, 0)))));
        schedules.add(new DayTimeSlot(
                DayOfWeek.TUESDAY,
                List.of(
                        new TimeSlot(LocalTime.of(10, 0), LocalTime.of(12, 0)),
                        new TimeSlot(LocalTime.of(14, 0), LocalTime.of(17, 0)))));

        bookings.add(
                new DayTimeSlot(DayOfWeek.TUESDAY, List.of(new TimeSlot(LocalTime.of(10, 0), LocalTime.of(10, 30)))));

        var freeTimeSlots = calculateFreeTimeSlots(schedules, bookings, interval);

        for (var slot : freeTimeSlots) {
            System.out.println(slot.day());
            for (var t : slot.timeSlots()) {
                System.out.println(" " + t.start() + " " + t.end());
            }
        }
    }

    private List<DayTimeSlot> calculateFreeTimeSlots(
            List<DayTimeSlot> schedules, List<DayTimeSlot> bookings, int interval) {
        var result = new ArrayList<DayTimeSlot>();

        for (var schedule : schedules) {
            var freeTimeSlots = new ArrayList<TimeSlot>();
            var day = schedule.day();

            for (var timeSlot : schedule.timeSlots()) {
                freeTimeSlots.addAll(calculateFreeSlotsForThisDay(day, timeSlot, bookings, interval));
            }

            result.add(new DayTimeSlot(day, freeTimeSlots));
        }

        return result;
    }

    private List<TimeSlot> calculateFreeSlotsForThisDay(
            DayOfWeek day, TimeSlot timeSlot, List<DayTimeSlot> bookings, int interval) {
        var freeTimeSlotsOfTheDay = new ArrayList<TimeSlot>();
        var t = timeSlot.start();

        var bookingsOfTheDay = bookings.stream()
                .filter(d -> d.day() == day)
                .flatMap(b -> b.timeSlots().stream())
                .toList();

        while (!t.plusMinutes(interval).isAfter(timeSlot.end())) {
            var candidate = new TimeSlot(t, t.plusMinutes(interval));

            if (!duplicateCandidate(day, candidate, bookingsOfTheDay)) {
                freeTimeSlotsOfTheDay.add(candidate);
            }

            t = t.plusMinutes(interval);
        }

        return freeTimeSlotsOfTheDay;
    }

    private boolean duplicateCandidate(DayOfWeek day, TimeSlot candidate, List<TimeSlot> bookings) {

        for (var booking : bookings) {
            if (candidate.start().isBefore(booking.end()) && candidate.end().isAfter(booking.start())) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        new FreeTimeSlots();
    }
}
