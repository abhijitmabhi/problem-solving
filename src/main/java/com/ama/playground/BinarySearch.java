package com.ama.playground;

public class BinarySearch {
    public int findIndexFromSortedArray(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("array cannot be null");
        }

        if (nums.length == 0) {
            throw new IllegalArgumentException("array cannot be empty");
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
