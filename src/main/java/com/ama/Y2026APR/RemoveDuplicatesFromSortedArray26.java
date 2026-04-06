package com.ama.Y2026APR;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1, 1, 1, 2, 2, 2, 2}));
    }

    private static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ptr < 1 || nums[i] != nums[ptr - 1]) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
