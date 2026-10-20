package com.ama.Y2026OCTO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Challenge01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
