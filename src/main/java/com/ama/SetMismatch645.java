package com.ama;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,4})));
    }

    public static int[] findErrorNums(int[] nums){
        int[] result = new int[2];
        int[] myArr = new int[nums.length+1];
        Arrays.fill(myArr,-1);

        for (int i=0; i < nums.length; i++){
            if(myArr[nums[i]] == -1){
                myArr[nums[i]] = nums[i];
            }else {
                result[0] = nums[i];
            }
        }

       for (int i=1; i < myArr.length; i++){
           if(myArr[i] == -1){
               result[1] = i;
           }
       }

        return result;
    }
}
