package com.ama.remind;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        System.out.println(reverseString("  hello world  "));
    }

    // Time: O(n)
    // Space: O(n)
    public static String reverseString(String s) {
        String[] strArr = s.trim().split("\\s+");
        int left = 0;
        int right = strArr.length - 1;

        while (left < right) {
            String temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", strArr);
    }
}
