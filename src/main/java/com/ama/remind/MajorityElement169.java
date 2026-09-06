package com.ama.remind;

public class MajorityElement169 {
    // TimeComplexity: O(n)
    // SpaceComplexity: 0(1)
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int findMajorityElement(int[] nums) {
        int voting = 1;
        int majority = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                voting++;
            } else if (voting > 1) {
                voting--;
            } else {
                majority = nums[i];
            }
        }

        return majority;
    }
}
