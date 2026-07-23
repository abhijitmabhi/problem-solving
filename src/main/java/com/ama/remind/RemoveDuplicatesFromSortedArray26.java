package com.ama.remind;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[ptr] != nums[i]) {
                nums[++ptr] = nums[i];
            }
        }

        return ptr + 1;
    }
}
