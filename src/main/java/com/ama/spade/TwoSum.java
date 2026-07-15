package com.ama.spade;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumIndices(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                return new int[]{indexMap.get(target - nums[i]), i};
            }

            indexMap.put(nums[i], i);
        }

        throw new IllegalStateException("No solution found");
    }
}
