package com.ama;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseString(new char[]{'h', 'e', 'l', 'l', 'o', 'r'})));
    }

    public static char[] reverseString(char[] s) {
        int leftPtr = 0;
        int rightPtr = s.length - 1;

        while (leftPtr < rightPtr) {
            char temp = s[leftPtr];
            s[leftPtr] = s[rightPtr];
            s[rightPtr] = temp;

            leftPtr++;
            rightPtr--;
        }

        return s;
    }
}
