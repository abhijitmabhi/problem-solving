package com.ama.Y2026;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 1}));
    }

    public static int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int maxWater = 0;

        while (first < last) {
            if (height[first] < height[last]) {
                maxWater = Math.max(maxWater, height[first] * (last - first));
                first++;
            } else {
                maxWater = Math.max(maxWater, height[last] * (last - first));
                last--;
            }
        }

        return maxWater;
    }
}
