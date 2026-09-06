package com.ama.remind;

import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
    }

    // Time: O(n)
    // Space: O(1)
    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;

            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);

            return result;
        }

        return digits;
    }
}
