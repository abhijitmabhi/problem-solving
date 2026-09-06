package com.ama.remind;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{0, 1, 0, 3, 12})));
    }

    // Time: O(n)
    // Space: O(1)
    public static int[] moveZeros(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ptr++] = nums[i];
            }
        }

        while (ptr < nums.length) {
            nums[ptr++] = 0;
        }

        return nums;
    }
}
