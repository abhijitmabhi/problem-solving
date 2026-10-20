package com.ama.remind;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{2, 0}));
    }

    // Time: O(n log n)
    // Space: O(1)
    public static int missing(int[] nums) {
        Arrays.sort(nums);
        int missing = 0;

        for (int n : nums) {
            if (n != missing) {
                return missing;
            }
            missing++;
        }

        return missing;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
