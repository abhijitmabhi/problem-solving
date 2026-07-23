package com.ama.remind;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber136 {
    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    // Time: O(n)
    // Space: O(n)
    public static int findSingleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1)
                return m.getKey();
        }

        return -1;
    }
}
