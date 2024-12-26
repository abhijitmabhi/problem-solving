package com.ama;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int maxAmount = 0;

        int leftPtr = 0;
        int rightPtr = height.length - 1;

        while (leftPtr != rightPtr) {
            int area = Math.min(height[leftPtr], height[rightPtr]) * Math.abs(rightPtr - leftPtr);
            maxAmount = Math.max(maxAmount, area);

            if (height[leftPtr] < height[rightPtr]) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }

        return maxAmount;
    }
}
