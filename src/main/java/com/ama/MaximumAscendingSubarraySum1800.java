package com.ama;

public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{100, 10, 1}));
    }

    private static int maxAscendingSum(int[] nums) {
        int sum = 0;
        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length -1 || nums[i] < nums[i+1]){
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
