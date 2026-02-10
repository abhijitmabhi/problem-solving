package com.ama.Y2026;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] myArr = new int[26];

        for (char c : s.toCharArray()) {
            myArr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            myArr[c - 'a']--;
        }

        for (int i : myArr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
