package com.ama;

import java.util.Arrays;

public class FirstMissingPositive41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
    }
    public static int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        int missingNumber = 1;

        for (int number : nums){
            if(number > 0){
                if(number == missingNumber){
                    missingNumber++;
                } else if (number > missingNumber) {
                    break;
                }
            }
        }

        return missingNumber;
    }
}

