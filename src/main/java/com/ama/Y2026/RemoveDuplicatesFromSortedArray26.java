package com.ama.Y2026;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
