package com.ama;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 9));
    }

    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] > target) {
                last = mid - 1;
            }
        }

        return first;
    }
}
