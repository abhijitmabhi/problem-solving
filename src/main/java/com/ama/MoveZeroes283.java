package com.ama;

public class MoveZeroes283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1, 1, 0, 2, 5});
    }

    public static void moveZeroes(int[] nums) {
        int ptrZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != ptrZero) {
                    nums[ptrZero] = nums[i];
                    nums[i] = 0;
                }
                ptrZero++;
            }
        }
    }
}
