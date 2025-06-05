package com.ama;

public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverse(-45646));
    }

    private static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;

            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return reverse;
    }

    private static int reverse2(int x) {
        boolean isNegative = x < 0;

        char[] xArr = String.valueOf(Math.abs(x)).toCharArray();

        int first = 0;
        int last = xArr.length - 1;

        while (first < last) {
            char temp = xArr[first];
            xArr[first] = xArr[last];
            xArr[last] = temp;

            first++;
            last--;
        }

        String reverseNum = String.valueOf(xArr);
        int result = 0;
        try {
            result = Integer.parseInt(reverseNum);
        } catch (Exception e) {
            return 0;
        }

        return isNegative ? -result : result;
    }
}
