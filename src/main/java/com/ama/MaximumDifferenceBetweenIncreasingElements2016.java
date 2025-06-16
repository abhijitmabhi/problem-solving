package com.ama;

public class MaximumDifferenceBetweenIncreasingElements2016 {
    public static void main(String[] args) {
        System.out.println(maximumDifference2(new int[]{1, 5, 2, 10}));
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

    private static int maximumDifference2(int[] nums) {
        int min = nums[0];
        int maxDiff = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                maxDiff = Math.max(maxDiff, nums[i] - min);
            } else {
                min = nums[i];
            }
        }

        return maxDiff == 0 ? -1 : maxDiff;
    }
}
