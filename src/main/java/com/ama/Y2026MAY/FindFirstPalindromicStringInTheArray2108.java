package com.ama.Y2026MAY;

public class FindFirstPalindromicStringInTheArray2108 {
    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }

    private static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }

        return "";
    }

    private static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
