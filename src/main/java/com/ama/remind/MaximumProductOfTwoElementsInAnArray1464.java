package com.ama.remind;

public class MaximumProductOfTwoElementsInAnArray1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, 5, 4, 5}));
    }

    // Time: O(n)
    // Space: O(1)
    public static int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = 0;

        for (int num : nums) {
            if (num >= max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
