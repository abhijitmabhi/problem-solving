package com.ama;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{1}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] != nums[i] + 1) {
                if (start != nums[i]) {
                    result.add(start + "->" + nums[i]);
                } else {
                    result.add(Integer.toString(nums[i]));
                }
                start = nums[i + 1];

                if (start == nums[nums.length - 1]) {
                    result.add(Integer.toString(start));
                }
            }

            if ((start != nums[nums.length - 1]) && (i + 1 == nums.length - 1)) {
                result.add(start + "->" + nums[nums.length - 1]);
            }

            if (nums.length == 1) {
                result.add(Integer.toString(nums[nums.length - 1]));
            }
        }

        return result;
    }
}
