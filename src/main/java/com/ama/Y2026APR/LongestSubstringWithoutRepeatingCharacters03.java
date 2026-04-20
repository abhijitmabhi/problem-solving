package com.ama.Y2026APR;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters03 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            if (hashSet.add(s.charAt(end))) {
                maxLength = Math.max(maxLength, hashSet.size());
                end++;
            } else {
                hashSet.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
