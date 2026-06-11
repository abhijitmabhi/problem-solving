package com.ama;

import java.util.HashMap;

public class SumOfUniqueElements1748 {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1,1,1,1,1}));
    }

    private static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        int sum = 0;

        for (var k : hashMap.entrySet()) {
            if (k.getValue() == 1) {
                sum += k.getKey();
            }
        }

        return sum;
    }
}
