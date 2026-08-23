package com.ama.sap2026;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("race a car"));
    }

    private static boolean validPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
