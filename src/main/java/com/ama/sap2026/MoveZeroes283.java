package com.ama.sap2026;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }

    private static int[] moveZeroes(int[] nums) {
        int ptr = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[ptr++] = num;
            }
        }

        while (ptr < nums.length) {
            nums[ptr++] = 0;
        }

        return nums;
    }
}
