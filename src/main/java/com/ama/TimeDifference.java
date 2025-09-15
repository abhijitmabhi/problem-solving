package com.ama;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeDifference {
    public static void main(String[] args) {
//        System.out.println(calculateTimeDifference("01:00pm-11:00am"));
        DateExample();
    }

    private static String calculateTimeDifference(String str) {
        String[] times = str.split("-");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mma", Locale.ENGLISH);
        LocalTime startTime = LocalTime.parse(times[0].trim().toUpperCase(), formatter);
        LocalTime endTime = LocalTime.parse(times[1].trim().toUpperCase(), formatter);

        int diff = (int) java.time.Duration.between(startTime, endTime).toMinutes();

        if(diff < 0){
            diff += 24*60;
        }

        return String.valueOf(diff);
    }

    private static void DateExample(){
        LocalDate date = LocalDate.now();
        LocalTime  time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println("###########################");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatedDate = dateTime.format(formatter);

        System.out.println(formatedDate);
    }
}
