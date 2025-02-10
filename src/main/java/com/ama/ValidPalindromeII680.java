package com.ama;

public class ValidPalindromeII680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("deeee"));
    }

    public static boolean validPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int leftPtr = 0;
        int rightPtr = s.length() - 1;

        while (leftPtr < rightPtr) {
            if (s.charAt(leftPtr) != s.charAt(rightPtr)) {
                return isPalindrome(s, leftPtr + 1, rightPtr) || isPalindrome(s, leftPtr, rightPtr - 1);
            }
            leftPtr++;
            rightPtr--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int leftPtr, int rightPtr) {

        while (leftPtr < rightPtr) {
            if (s.charAt(leftPtr) != s.charAt(rightPtr)) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }

        return true;
    }
}
