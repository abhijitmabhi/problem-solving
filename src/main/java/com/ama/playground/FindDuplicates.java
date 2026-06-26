package com.ama.playground;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public int[] duplicateNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        Set<Integer> uniqueNums = new HashSet<>();
        List<Integer> duplicateNums = new ArrayList<>();

        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                duplicateNums.add(num);
            }
        }

        return duplicateNums.stream()
                .mapToInt(Integer::intValue)
                .distinct()
                .toArray();
    }
}
