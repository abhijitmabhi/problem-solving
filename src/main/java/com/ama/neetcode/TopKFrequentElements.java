package com.ama.neetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (arr[entry.getValue()] == null) {
                arr[entry.getValue()] = new ArrayList<>();
                arr[entry.getValue()].add(entry.getKey());
            } else {
                arr[entry.getValue()].add(entry.getKey());
            }
        }

        int[] result = new int[k];

        for (int i = arr.length - 1; i >= 0 && k > 0; i--) {
            if (arr[i] != null) {
                for (int j = 0; j < arr[i].size() && k > 0; j++) {
                    result[--k] = arr[i].get(j);
                }
            }
        }

        return result;
    }
}
