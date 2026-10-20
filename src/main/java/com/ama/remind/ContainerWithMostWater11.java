package com.ama.remind;

public class ContainerWithMostWater11 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * Math.abs(right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * Math.abs(left - right));
                right--;
            }
        }

        return maxArea;
    }
}
