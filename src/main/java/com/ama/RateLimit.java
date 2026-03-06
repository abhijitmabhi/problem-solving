package com.ama;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RateLimit {
    public static void main(String[] args) {
        int requestWindow = 1;
        int maxRequest = 3;

        Map<Integer, Deque<LocalDateTime>> limitStore = new HashMap<>();
        Deque<LocalDateTime> limits = new ArrayDeque<>();
        limits.add(LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 0, 15)));
        limits.add(LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 0, 30)));
        limits.add(LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 0, 45)));

        limitStore.put(1, limits);


        // Is Possible a NEW Entry?
        var newEntry = LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 5, 55));
        var userId = 1;
        if (isLimitPermits(requestWindow, userId, newEntry, limitStore, maxRequest)) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");
        }

        for (var k : limitStore.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }

    }

    private static boolean isLimitPermits(int requestWindow, int userId, LocalDateTime newEntry, Map<Integer, Deque<LocalDateTime>> limitStore, int maxRequest) {
        limitStore.get(userId)
                .removeIf(x -> x.isBefore(newEntry.minusMinutes(requestWindow)));

        if (limitStore.get(userId).size() < maxRequest) {
            limitStore.get(userId).add(newEntry);
            return true;
        } else {
            return false;
        }

    }
}
