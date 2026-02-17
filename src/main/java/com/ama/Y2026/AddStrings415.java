package com.ama.Y2026;

public class AddStrings415 {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }

    public static String addStrings(String num1, String num2) {
        int x = num1.length() - 1;
        int y = num2.length() - 1;
        int carry = 0;

        StringBuilder strBdr = new StringBuilder();

        while (x >= 0 || y >= 0 || carry > 0) {
            int x1 = x >= 0 ? num1.charAt(x) - '0' : 0;
            int y1 = y >= 0 ? num2.charAt(y) - '0' : 0;

            int sum = x1 + y1 + carry;

            carry = sum / 10;

            strBdr.append(sum % 10);

            x--;
            y--;
        }

        return strBdr.reverse().toString();
    }
}
