package com.ama;

public class RemoveDuplicatesFromSortedArrayII80 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ptr < 2 || nums[i] != nums[ptr - 2]) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
