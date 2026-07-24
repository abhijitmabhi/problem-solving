package com.ama.remind;

public class RemoveTrailingZerosFromAString2710 {
    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("1203000"));
    }

    // Time: O(n)
    // Space: O(1)
    public static String removeTrailingZeros(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
