package com.ama.spade;

public class ValidPalindrome {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        //s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
