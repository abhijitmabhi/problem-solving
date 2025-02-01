package com.ama;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1,2,3,4,5,6,7}, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        if (k == nums.length) {
            return nums;
        }

        if (k > nums.length) {
            k = k % nums.length; // 8 % 7 = 1
        }

        for (int i = 0; i < nums.length; i++) {
            if (i + k < nums.length) {
                result[i + k] = nums[i];
            } else {
                int r = (i+k) - nums.length;
                result[r] = nums[i];
            }
        }

        return result;
    }
}
