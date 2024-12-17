package com.ama;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays2215 {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().toList());
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().toList());

        var result1 = set1.stream().filter(x -> !set2.contains(x)).toList();
        var result2 = set2.stream().filter(x -> !set1.contains(x)).toList();

        return List.of(result1, result2);
    }
}
