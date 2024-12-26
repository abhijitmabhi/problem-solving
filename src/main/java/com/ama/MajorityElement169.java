package com.ama;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement3(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums.length / 2;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majority) {
                return num;
            }
        }

        return -1;
    }

    public static int majorityElement3(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                votes++;
            } else if (nums[i] != majority && votes != 0) {
                votes--;
            } else {
                majority = nums[i];
                votes = 1;
            }
        }

        return majority;
    }
}
