package com.ama;

public class FindFirstPalindromicStringInTheArray2108 {
    public static void main(String[] args) {
        String[] words = new String[]{"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isValidPalindrome(word))
                return word;
        }

        return "";
    }

    private static boolean isValidPalindrome(String word) {
        int leftPtr = 0;
        int rightPtr = word.length() - 1;

        while (leftPtr < rightPtr) {
            if (word.charAt(leftPtr) != word.charAt(rightPtr))
                return false;

            leftPtr++;
            rightPtr--;
        }

        return true;
    }
}
