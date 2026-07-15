package com.ama.spade;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // 1. Create a HashSet to store the unique numbers
    // 2. Check if the HashSet contains the current number
    public boolean isContainsDuplicate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        Set<Integer> uniqueNums = new HashSet<>();

        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                return true;
            }
        }

        return false;
    }
}
