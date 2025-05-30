package com.ama;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIIInputArrayIsSorted167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumII(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSumII(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];

            if (!hashMap.containsKey(num)) {
                hashMap.put(numbers[i], i);
            } else {
                return new int[]{hashMap.get(num) + 1, i + 1};
            }
        }

        return new int[]{};
    }
}
