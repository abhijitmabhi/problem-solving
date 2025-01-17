package com.ama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3Sum15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2,0,1,1,2}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(Arrays.stream(nums).allMatch(x -> x == 0)){
            result.add(List.of(0,0,0));

            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            var triplet = new ArrayList<Integer>();
            var leftPtr = i + 1;
            var rightPtr = nums.length - 1;

            while (leftPtr != rightPtr) {
                var tempSum = nums[i] + nums[leftPtr] + nums[rightPtr];

                if (tempSum != 0) {
                    if (tempSum < 0) {
                        leftPtr++;
                    } else {
                        rightPtr--;
                    }
                } else {
                    triplet.addAll(List.of(nums[i], nums[leftPtr], nums[rightPtr]));
                    result.add(new ArrayList<>(triplet));
                    leftPtr++;
                    triplet.clear();
                }
            }
        }

        return result.stream().distinct().toList();

    }
}
