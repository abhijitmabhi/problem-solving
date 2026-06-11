package com.ama;

public class RemoveElement27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
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
