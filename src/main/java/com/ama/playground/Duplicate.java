package com.ama.playground;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean hasDuplicateInArray(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (nums.length == 0) {
            return false;
        }

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : nums) {
            if (!uniqueNumbers.add(num)) {
                return true;
            }
        }

        return false;
    }
}
