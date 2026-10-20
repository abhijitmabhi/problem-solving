package com.ama.remind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }

    // Time: O(n)
    // Space: O(n)
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();

        for (int i : nums2) {
            set2.add(i);
        }

        Set<Integer> onlyNum1 = new HashSet<>(set1);
        onlyNum1.removeAll(set2);

        Set<Integer> onlyNum2 = new HashSet<>(set2);
        onlyNum2.removeAll(set1);

        return List.of(new ArrayList<>(onlyNum1), new ArrayList<>(onlyNum2));
    }
}
