package com.ama;

import java.util.HashMap;

public class ContainsDuplicateII219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int oldValue = map.get(nums[i]);

                if (Math.abs(oldValue - i) <= k) {
                    return true;
                }
                map.put(nums[i], i );
            }
        }
        return false;
    }
}
