package com.ama.Y2026;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9})));
    }

    public static int[] plusOne(int[] digits) {
        int x = digits.length - 1;
        int y = 0;
        int carry = 0;

        StringBuilder strBdr = new StringBuilder();

        while (x >= 0 || y >= 0 || carry > 0) {
            int x1 = x >= 0 ? digits[x] : 0;
            int y1 = y >= 0 ? 1 : 0;

            int result = x1 + y1 + carry;

            carry = result / 10;

            strBdr.append(result % 10);

            x--;
            y--;
        }

        return strBdr.reverse().toString().chars().map(p -> p - '0').toArray();
    }
}
