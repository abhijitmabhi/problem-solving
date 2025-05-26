package com.ama;

import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1,0,1,2}));
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            hashSet.add(i);
        }

        int maxConsecutive = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentMaxConsecutive = 1;

            while (hasNextConsecutive(currentNum, hashSet)) {
                currentMaxConsecutive++;
                currentNum = currentNum+1;
            }

            maxConsecutive = Math.max(maxConsecutive, currentMaxConsecutive);
        }

        return maxConsecutive;
    }

    private static boolean hasNextConsecutive(int currentNum, HashSet<Integer> hashSet) {
        if (hashSet.contains(currentNum + 1)) {
            return true;
        }

        return false;
    }
}
