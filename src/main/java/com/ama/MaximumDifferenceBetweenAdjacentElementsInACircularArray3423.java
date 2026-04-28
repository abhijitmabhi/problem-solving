package com.ama;

public class MaximumDifferenceBetweenAdjacentElementsInACircularArray3423 {
    public static void main(String[] args) {
        System.out.println(maxAdjacentDistance(new int[]{1, 2, 4}));
    }

    private static int maxAdjacentDistance(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int distance = i == nums.length - 1 ? Math.abs(nums[i] - nums[0]) : Math.abs(nums[i] - nums[i + 1]);
            if (distance > max) {
                max = distance;
            }
        }

        return max;
    }
}
