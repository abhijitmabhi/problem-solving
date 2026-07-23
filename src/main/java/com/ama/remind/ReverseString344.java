package com.ama.remind;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseString(new char[]{'h', 'e', 'l', 'l', 'o'})));
    }

    // Time: O(n)
    // Space: O(1)
    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        return s;
    }
}
