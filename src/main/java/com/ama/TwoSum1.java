package com.ama;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (!hashMap.containsKey(num)){
                hashMap.put(nums[i], i);
            } else {
                return new int[]{hashMap.get(num), i};
            }
        }

        return new int[]{};
    }
}
