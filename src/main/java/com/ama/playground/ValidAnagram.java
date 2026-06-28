package com.ama.playground;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        return charCount.values().stream().allMatch(count -> count == 0);
    }
}
