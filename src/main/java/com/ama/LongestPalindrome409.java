package com.ama;

public class LongestPalindrome409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    private static int longestPalindrome(String s) {
        int[] countArr = new int[128];

        for (int c : s.toCharArray()) {
            countArr[c]++;
        }

        int result = 0;

        for (int c : countArr) {
            result += c / 2 * 2;
        }

        if (result < s.length())
            result++;

        return result;
    }
}
