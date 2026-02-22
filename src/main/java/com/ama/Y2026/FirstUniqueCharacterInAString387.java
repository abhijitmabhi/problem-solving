package com.ama.Y2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> k : hashMap.entrySet()) {
            if (k.getValue() == 1) {
                return s.indexOf(k.getKey());
            }
        }

        return -1;
    }
}
