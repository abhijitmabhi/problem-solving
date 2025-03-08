package com.ama;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int leftPtr = 0;
        int rightPtr = s.length() - 1;

        while (leftPtr < rightPtr) {
            if (s.charAt(leftPtr) != s.charAt(rightPtr))
                return false;

            leftPtr++;
            rightPtr--;
        }

        return true;
    }
}
