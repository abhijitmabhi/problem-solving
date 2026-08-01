package com.ama.remind;

public class LongestPalindromicSubstring05 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    // Time: O(n^2)
    // Space: O(n)
    public static String longestPalindrome(String s) {
        if(s.length() == 1) {
            return s;
        }

        StringBuilder longestPalindrome = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length()) {
                    break;
                }
            }

            String currentPalindrome = s.substring(left + 1, right);
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome.setLength(0);
                longestPalindrome.append(currentPalindrome);
            }

            left = i - 1;
            right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length()) {
                    break;
                }
            }

            currentPalindrome = s.substring(left + 1, right);
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome.setLength(0);
                longestPalindrome.append(currentPalindrome);
            }
        }

        return longestPalindrome.toString();
    }
}
