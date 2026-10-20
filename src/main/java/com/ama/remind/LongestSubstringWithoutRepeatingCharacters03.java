package com.ama.remind;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters03 {
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }

    // Time: O(n)
    // Space: O(n)
    public static int longestSubstring(String s) {
        Set<Character> mySet = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            if (mySet.add(s.charAt(right))) {
                max = Math.max(max, mySet.size());
                right++;
            } else {
                mySet.remove(s.charAt(left));
                left++;
            }
        }

        return max;

    }
}
