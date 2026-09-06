package com.ama.remind;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMitchMatch(new int[]{2, 3, 3})));
    }

    // Time: O(n)
    // Space: O(n)
    public static int[] findMitchMatch(int[] nums) {
        int[] arrNums = new int[nums.length + 1];

        int missing = 1;
        int duplicate = -1;

        for (int num : nums) {
            arrNums[num]++;
        }

        for (int i = 1; i < arrNums.length; i++) {
            if (arrNums[i] == 2) {
                duplicate = i;
            }

            if (arrNums[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
