package com.ama.Y2026APR;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[] {1, 1})));
    }

    private static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] myArr = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            myArr[nums[i]]++;
        }

        for(int i = 1; i < myArr.length; i++) {
            if(myArr[i] == 2) {
                result[0] = i;
            }

            if(myArr[i] == 0) {
                result[1] = i;
            }
        }

        return result;
    }
}
