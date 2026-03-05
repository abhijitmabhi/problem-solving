package com.ama.Y2026;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }

        return null;
    }
}
