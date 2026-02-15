package com.ama.Y2026;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        moveZeroes(new int[] {0, 1, 0, 3, 12});
    }

    public static void moveZeroes(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ptr++] = nums[i];
            }
        }

        while (ptr < nums.length) {
            nums[ptr++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
