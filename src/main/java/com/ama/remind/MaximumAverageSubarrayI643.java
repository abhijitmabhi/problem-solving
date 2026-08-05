package com.ama.remind;

public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        // 1, 12, -5, -6, 50, 3 // k = 4

        double sum = 0.0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}
