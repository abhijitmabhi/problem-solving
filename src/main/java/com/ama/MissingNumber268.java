package com.ama;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int missingNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != missingNumber){
                return missingNumber;
            }
            missingNumber++;
        }

        return missingNumber;
    }
}
