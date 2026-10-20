package com.ama.sap2026;

public class RemoveElement27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int ptr = 0;

        for (int num : nums) {
            if (num != val) {
                nums[ptr++] = num;
            }
        }

        return ptr;
    }
}
