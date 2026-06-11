package com.ama;

public class SmallestRangeI908 {
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{1,3,6}, 3));
    }

    private static int smallestRangeI(int[] nums, int k) {
        int min_val = nums[0];
        int max_val = nums[0];

        for (int i = 0; i < nums.length; i++) {
            min_val = Math.min(min_val, nums[i]);
            max_val = Math.max(max_val, nums[i]);
        }

        if ((min_val + k) >= (max_val - k)) {
            return 0;
        } else {
            return (max_val - k) - (min_val + k);
        }
    }
}
