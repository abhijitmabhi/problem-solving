package com.ama;

public class MaximumDifferenceBetweenIncreasingElements2016 {
    public static void main(String[] args) {
        System.out.println(maximumDifference(new int[]{1, 5, 2, 10}));
    }

    private static int maximumDifference(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    max = Math.max(max, nums[j] - nums[i]);
                }
            }
        }

        return max == 0 ? -1 : max;
    }
}
