package com.ama.Y2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.stream(nums1)
                .filter(x -> Arrays.stream(nums2).noneMatch(u -> u == x))
                .boxed()
                .distinct()
                .toList());

        result.add(Arrays.stream(nums2)
                .filter(x -> Arrays.stream(nums1).noneMatch(u -> u == x))
                .boxed()
                .distinct()
                .toList());

        return result;
    }
}
