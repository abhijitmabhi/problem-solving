package com.ama.remind;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println(missing(new int[]{0,1}));
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
}
