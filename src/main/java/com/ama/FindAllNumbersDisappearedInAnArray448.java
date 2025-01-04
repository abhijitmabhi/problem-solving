package com.ama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] myArr = new int[nums.length + 1];
        Arrays.fill(myArr, -1);

        for (int i = 0; i < nums.length; i++) {
            if (myArr[nums[i]] == -1) {
                myArr[nums[i]] = nums[i];
            }
        }

        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] == -1) {
                result.add(i);
            }
        }

        return result;
    }
}
