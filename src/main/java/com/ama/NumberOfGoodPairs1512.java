package com.ama;

import java.util.HashMap;

public class NumberOfGoodPairs1512 {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    private static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        int numOfPairs = 0;

        for (var k : hashMap.entrySet()) {
            numOfPairs += countPairs(k.getValue());
        }

        return numOfPairs;
    }

    private static int countPairs(int value) {
        return  (value * (value - 1)) / 2;
    }


}
