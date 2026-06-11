package com.ama;

import java.util.HashMap;
import java.util.Objects;

public class FindLuckyIntegerInAnArray1394 {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{1, 2, 2, 3, 3, 3}));
    }

    private static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int largest = 0;

        for (var k : hashMap.entrySet()) {
            if (Objects.equals(k.getKey(), k.getValue())) {
                largest = Math.max(largest, k.getKey());
            }
        }

        return largest == 0 ? -1 : largest;
    }
}
