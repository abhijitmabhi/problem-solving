package com.ama.playground;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[] {1, 1})));
    }

    private static int[] findErrorNums(int[] nums) {
        int[] result = new int[nums.length + 1];
        int[] duplicate = new int[2];

        for (int num : nums) {
            result[num]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 2) {
                duplicate[0] = i;
            }
            if (result[i] == 0) {
                duplicate[1] = i;
            }
        }

        return duplicate;
    }
}
