package com.ama.Y2026;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum01 {
    static void main() {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 18)));
    }

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[] {map.get(target - nums[i]), i};
            }
        }

        return new int[] {};
    }
}
