package com.ama.playground;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            throw  new IllegalArgumentException("Invalid input");
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}
