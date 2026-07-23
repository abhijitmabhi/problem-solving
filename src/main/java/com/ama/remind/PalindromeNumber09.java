package com.ama.remind;

public class PalindromeNumber09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        return x == reverse(x);
    }

    private static int reverse(int x) {
        int rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return rev;
    }
}
