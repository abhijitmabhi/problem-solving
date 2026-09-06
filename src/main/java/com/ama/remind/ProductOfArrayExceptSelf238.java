package com.ama.remind;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf2(new int[]{1, 2, 3, 4})));
    }

    // Time: O(n)
    // Space: O(n)
    public static int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] result = new int[nums.length];

        leftArr[0] = 1;

        for (int i = 1; i < leftArr.length; i++) {
            leftArr[i] = nums[i - 1] * leftArr[i - 1];
        }

        rightArr[rightArr.length - 1] = 1;

        for (int i = rightArr.length - 1 - 1; i >= 0; i--) {
            rightArr[i] = rightArr[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = leftArr[i] * rightArr[i];
        }

        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;

        for (int i = 1; i < result.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = nums[i] * right;
        }

        return result;
    }
}
