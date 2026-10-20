package com.ama.remind;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 1}));
    }

    // Time: O(n)
    // Space: O(n)
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }

        return false;
    }
}
