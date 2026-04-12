package com.ama.Y2026APR;

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2,}));
    }

    private static int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (fast != slow);

        slow = 0;

        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return slow;
    }
}
