package com.ama.remind;

public class FirstMissingPositive41 {
    public static void main(String[] args) {
        System.out.println(findMissing(new int[]{3, 4, -1, 1}));
    }

    // Time: O(n)
    // Space: O(1)
    public static int findMissing(int[] nums) {
        // [1,2,3,4]
        //  0,1,2,

        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correctIndex = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return n + 1;
    }
}
