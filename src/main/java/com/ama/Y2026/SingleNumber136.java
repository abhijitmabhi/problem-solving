package com.ama.Y2026;

public class SingleNumber136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        int val = 0;

        for (int i = 0; i < nums.length; i++) {
            val = val ^ nums[i];
        }

        return val;
    }
}
