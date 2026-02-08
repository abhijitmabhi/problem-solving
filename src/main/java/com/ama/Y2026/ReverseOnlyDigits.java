package com.ama.Y2026;

import java.util.Arrays;

public class ReverseOnlyDigits {
    static void main() {
        System.out.println(reverseDigits("Ghdg1h7d6sdh9"));
    }

    private static String reverseDigits(String str) {
        char[] strArr = str.toCharArray();

        int start = 0;
        int end = strArr.length - 1;

        while (start < end) {
            if (Character.isDigit(strArr[start]) && Character.isDigit(strArr[end])) {
                char temp = strArr[start];
                strArr[start] = strArr[end];
                strArr[end] = temp;

                start++;
                end--;
            } else if (Character.isDigit(strArr[start])) {
                end--;
            } else if (Character.isDigit(strArr[end])) {
                start++;
            } else {
                start++;
                end--;
            }


        }

        return String.valueOf(strArr);
    }
}
