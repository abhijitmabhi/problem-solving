package com.ama.sap2026;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    static int majorityElement(int[] nums) {
        int majority = nums[0];
        int voting = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                voting++;
            } else if (nums[i] != majority && voting >= 1) {
                voting--;
            } else {
                majority = nums[i];
                voting = 1;
            }
        }

        return majority;
    }
}
