package com.ama.playground;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public char firstNonRepeatingChar(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '-';
    }
}
