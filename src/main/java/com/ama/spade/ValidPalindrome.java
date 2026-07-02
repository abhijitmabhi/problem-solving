package com.ama.spade;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

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
