package com.ama;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr = m;
        for (int i = 0; i < n; i++) {
            nums1[ptr++] = nums2[i];
        }

        Arrays.sort(nums1);

        // bubble sort for Ascending  order
//        for (int i = 0; i < nums1.length - 1; i++) {
//            for (int j = 0; j < nums1.length - 1 - i; j++) {
//                if (nums1[j] > nums1[j + 1]) {
//                    int temp = nums1[j];
//                    nums1[j] = nums1[j + 1];
//                    nums1[j + 1] = temp;
//                }
//            }
//        }

        // print
        System.out.println(Arrays.toString(nums1));
    }
}
