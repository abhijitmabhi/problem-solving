package com.ama.Y2026;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{6,5,5}));
    }

    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int voting = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                voting++;
            } else if (voting == 0) {
                major = nums[i];
                voting = 1;
            } else {
                voting--;
            }
        }

        return major;
    }
}
