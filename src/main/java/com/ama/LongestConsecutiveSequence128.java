package com.ama;

import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            hashSet.add(i);
        }

        int maxConsecutive = 0;

        for (int num : hashSet) {
            int currentNum = num;
            int currentMaxConsecutive = 1;

            if (!hashSet.contains(currentNum - 1)) {
                while (hashSet.contains(currentNum+1)) {
                    currentMaxConsecutive++;
                    currentNum = currentNum + 1;
                }

                maxConsecutive = Math.max(maxConsecutive, currentMaxConsecutive);
            }

        }

        return maxConsecutive;
    }
}
