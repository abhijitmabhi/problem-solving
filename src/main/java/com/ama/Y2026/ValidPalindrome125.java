package com.ama.Y2026;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int first = 0;
        int last = s.length() - 1;

        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
