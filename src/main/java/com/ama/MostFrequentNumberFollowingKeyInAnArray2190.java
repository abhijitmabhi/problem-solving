package com.ama;

import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentNumberFollowingKeyInAnArray2190 {
    public static void main(String[] args) {
        System.out.println(mostFrequent(new int[]{1, 1, 2, 1, 2}, 1));
    }

    public static int mostFrequent(int[] nums, int key) {

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i = 0; i <= nums.length - 2; i++) {

            if (nums[i] == key) {
                int target = nums[i + 1];

                int count = 0;
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == target && j != i+1) {
                        count++;
                    }

                    myHashMap.put(target, count);
                }
            }
        }

        var myList = new ArrayList<>(myHashMap.entrySet());
        myList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        return myList.getFirst().getKey();
    }
}
