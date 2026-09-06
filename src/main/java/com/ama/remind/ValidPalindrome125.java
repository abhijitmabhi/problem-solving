package com.ama.remind;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isValid("A man, a plan, a canal: Panama"));
    }

    // Time: O(n)
    // Space: O(1)
    public static boolean isValid(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
