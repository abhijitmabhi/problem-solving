package com.ama.sap2026;

import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{-1,-100,3,99}, 2)));
    }

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;

        k = k % n;
        rotate(nums, 0, n - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, n - 1);

        return nums;
    }

    private static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
