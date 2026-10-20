package com.ama.remind;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        System.out.println(firstUnique("loveleetcode"));
    }

    // Time: O(n)
    // Space: 0(n)
    public static int firstUnique(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
