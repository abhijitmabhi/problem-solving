package com.ama;

import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagramz", "nagaramz"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] myArr = new int[26];

        for (char c : s.toCharArray()) {
            myArr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            myArr[c - 'a']--;
        }

        for (int i : myArr) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
