package com.ama;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i : arr) {
            myHashMap.put(i, myHashMap.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> myHash = new HashSet<>();

        for (var i : myHashMap.entrySet()) {
            if (!myHash.add(i.getValue()))
                return false;
        }

        return true;
    }
}
