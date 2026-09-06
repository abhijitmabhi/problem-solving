package com.ama.sap2026;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("bbbbb"));
    }

    private static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            if (set.add(s.charAt(right))) {
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }

            right++;
        }

        return maxLength;
    }
}
