package com.ama;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums){
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }

        return k+1;
    }
}
