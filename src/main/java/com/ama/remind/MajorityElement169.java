package com.ama.remind;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    // TimeComplexity: O(n)
    // SpaceComplexity: 0(n)
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{3, 2, 3}));
    }

    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> countMajority = new HashMap<>();

        for (int num : nums) {
            countMajority.put(num, countMajority.getOrDefault(num, 0) + 1);
        }

        return Collections.max(countMajority.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
