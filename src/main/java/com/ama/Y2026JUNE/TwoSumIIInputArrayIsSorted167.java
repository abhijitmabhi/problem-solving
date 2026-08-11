package com.ama.Y2026JUNE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputArrayIsSorted167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i + 1};
            }

            map.put(numbers[i], i + 1);
        }

        return new int[]{};
    }
}


