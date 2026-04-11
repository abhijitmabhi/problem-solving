package com.ama.Y2026;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrors(new int[] {1, 1})));

        // 1 2 2 3 4 5
    }

    public static int[] findErrors(int[] nums) {
        int[] result = new int[nums.length + 1];
        int duplicate = -1;
        int missing = -1;

        for (int num : nums) {
            result[num]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 2) {
                duplicate = i;
            }
            if (result[i] == 0) {
                missing = i;
            }
        }

        return new int[] {duplicate, missing};
    }
}
