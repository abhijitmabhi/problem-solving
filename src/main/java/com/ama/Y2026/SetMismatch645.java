package com.ama.Y2026;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums2(new int[] {2, 2})));
    }

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int missing = 1;
        int duplicate = -1;

        for (int i = 0; i < nums.length; i++) {
            if (missing == nums[i]) missing++;

            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            }
        }

        return new int[] {duplicate, missing};
    }

    public static int[] findErrorNums2(int[] nums) {
        int[] myArr = new int[nums.length + 1];
        int duplicate = -1;
        int missing = -1;

        for (int i : nums) {
            myArr[i]++;
        }

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 2) duplicate = i;
            else if (myArr[i] == 0) {
                missing = i;
            }
        }

        return new int[] {duplicate, missing};
    }
}
