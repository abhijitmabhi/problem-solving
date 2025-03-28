package com.ama;

public class MoveZeroes283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 1, 0, 2, 5});
    }

    public static void moveZeroes(int[] nums) {
        int ptr = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[ptr++] = nums[i];
            }
        }

        while (ptr < nums.length) {
            nums[ptr++] = 0;
        }
    }
}
