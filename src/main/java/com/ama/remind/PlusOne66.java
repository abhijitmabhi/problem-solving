package com.ama.remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
    }

    public static int[] plusOne(int[] digits) {
        int x = digits.length - 1;
        int y = 0;
        int carry = 0;

        StringBuilder strBdr = new StringBuilder();

        while (x >= 0 || y >= 0 || carry > 0) {
            int x1 = x >= 0 ? digits[x] : 0;
            int y1 = y >= 0 ? 1 : 0;

            int sum = x1 + y1 + carry;

            carry = sum / 10;

            strBdr.append(sum % 10);

            x--;
            y--;
        }

        List<Integer> result = new ArrayList<>();

        for (char c : strBdr.reverse().toString().toCharArray()) {
            result.add(Character.getNumericValue(c));
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
