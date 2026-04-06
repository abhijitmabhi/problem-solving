package com.ama.Y2026APR;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3, 2, 2}));
    }

    private static int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                votes++;
            } else if (nums[i] != majority && votes != 0) {
                votes--;
            } else {
                majority = nums[i];
                votes = 1;
            }
        }

        return majority;
    }
}
