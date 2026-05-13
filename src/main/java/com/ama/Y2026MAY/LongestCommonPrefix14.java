package com.ama.Y2026MAY;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return first.substring(0, i);
            }
        }

        return first;
    }
}
