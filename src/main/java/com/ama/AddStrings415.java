package com.ama;

public class AddStrings415 {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit01 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit02 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit01 + digit02 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
