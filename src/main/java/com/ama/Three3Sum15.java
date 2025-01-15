package com.ama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3Sum15 {
    public static void main(String[] args) {
        threeSum(new int[]{0,0,0,0});
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            var triplet = new ArrayList<Integer>();
            int leftPtr = i + 1;
            int rightPtr = nums.length - 1;

            while (leftPtr != rightPtr) {
                var tempSum = nums[i] + nums[leftPtr] + nums[rightPtr];
                if (tempSum != 0) {
                    if (tempSum < 0) {
                        leftPtr++;
                    } else {
                        rightPtr--;
                    }

                } else {
                    triplet.add(nums[i]);
                    triplet.add(nums[leftPtr]);
                    triplet.add(nums[rightPtr]);

                    result.add(triplet);
                    break;
                }
            }
        }

        return result;

    }
}
