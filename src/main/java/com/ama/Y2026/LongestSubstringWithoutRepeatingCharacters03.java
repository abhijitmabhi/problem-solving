package com.ama.Y2026;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters03 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }

    public static int longestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();

        int start = 0;
        int end = 0;
        int maxLength = 0;

        while (end < s.length()) {
            if (hashSet.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, hashSet.size());
            } else {
                hashSet.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;


    }

}
