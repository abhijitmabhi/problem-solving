package com.ama;

public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50}));
    }

    private static int maxAscendingSum(int[] nums) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] > nums[i-1]){
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
