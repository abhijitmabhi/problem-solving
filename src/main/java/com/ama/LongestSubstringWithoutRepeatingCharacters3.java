package com.ama;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;

        if (s.isBlank() || s.length() == 1)
            return 1;

        LinkedHashSet<Character> myHash = new LinkedHashSet<>();
        int longestSubstringLength = Integer.MIN_VALUE;
        int i = 0;

        while (i < s.length()) {
            if (!myHash.add(s.charAt(i))) {
                longestSubstringLength = Math.max(myHash.size(), longestSubstringLength);
                int duplicateIndex = getIndex(myHash, s.charAt(i));
                removeItemsUpToIndex(myHash,duplicateIndex);
            } else {
                i++;
            }

            if (i == s.length()) {
                longestSubstringLength = Math.max(myHash.size(), longestSubstringLength);
            }
        }

        return longestSubstringLength;
    }

    public static int getIndex(LinkedHashSet<Character> set, char target) {
        int index = 0;
        for (Character character : set) {
            if (character == target) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void removeItemsUpToIndex(LinkedHashSet<Character> set, int indexToRemoveUpTo) {
        Iterator<Character> iterator = set.iterator();
        int currentIndex = 0;

        while (iterator.hasNext() && currentIndex <= indexToRemoveUpTo) {
            iterator.next();
            iterator.remove();
            currentIndex++;
        }
    }
}
