package com.ama.remind;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doRotation(new int[]{1, 6, 3, 7})));
    }

    public static int[] doRotation(int[] nums) {
       return IntStream.rangeClosed(1, nums.length)
               .map(i -> nums[nums.length - i])
               .toArray();
    }
}
