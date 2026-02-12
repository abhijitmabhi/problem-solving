package com.ama.Y2026;

public class RemoveElement27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3, 2, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
