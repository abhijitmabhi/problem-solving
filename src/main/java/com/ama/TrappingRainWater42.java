package com.ama;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trapWater = 0;

        while (left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);

            if (height[left] < height[right]){
                trapWater += leftMax - height[left];
                left++;
            }else {
                trapWater += rightMax - height[right];
                right--;
            }
        }

        return trapWater;
    }

}
