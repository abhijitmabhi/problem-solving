package com.ama.sap2026;

public class ReverseWordsinaString151 {
    public static void main(String[] args) {
        System.out.println(reverString("the sky is blue"));
    }

    private static String reverString(String s) {
        String[] str = s.trim().split("\\s+");

        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", str);
    }
}
