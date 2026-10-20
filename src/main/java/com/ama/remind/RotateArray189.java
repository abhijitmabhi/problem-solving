package com.ama.remind;

import java.util.Arrays;

public class RotateArray189 {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doRotation(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    public static int[] doRotation(int[] nums, int k) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            if (i + k < result.length) {
                result[i + k] = nums[i];
            } else {
                result[(i + k) % result.length] = nums[i];
            }
        }

        return result;
    }
}
