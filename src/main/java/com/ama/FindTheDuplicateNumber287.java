package com.ama;

import java.util.Arrays;

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }

        return -1;
    }
}
