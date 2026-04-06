package com.ama.Y2026APR;

public class RemoveDuplicatesFromSortedArrayII80 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ptr < 2 || nums[i] != nums[ptr - 2]) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
