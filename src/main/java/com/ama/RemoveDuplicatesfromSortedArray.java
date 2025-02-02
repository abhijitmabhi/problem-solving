package com.ama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> myHash = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (myHash.add(nums[i])) {
                k++;
            }
        }

        List<Integer> uniqueNumberList = new ArrayList<>(myHash);
        Collections.sort(uniqueNumberList);

        for (int i = 0; i < uniqueNumberList.size(); i++) {
            nums[i] = uniqueNumberList.get(i);
        }

        return k;
    }
}
