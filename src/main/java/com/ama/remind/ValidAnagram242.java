package com.ama.remind;

import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isValid2("anagram", "nagaram"));
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n+m)
    public static boolean isValid(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isValid2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
