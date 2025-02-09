package com.ama;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> myHash = new HashSet<>();
        int leftPtr = 0;
        int rightPtr = 0;
        int maxLength = 0;

        while (rightPtr < s.length()) {
            if (!myHash.contains(s.charAt(rightPtr))) {
                myHash.add(s.charAt(rightPtr));
                rightPtr++;
                maxLength = Math.max(myHash.size(), maxLength);
            } else {
                myHash.remove(s.charAt(leftPtr));
                leftPtr++;
            }
        }

        return maxLength;
    }
}
