package com.ama.remind;

public class MaximumProductOfTwoDigits3536 {
    public static void main(String[] args) {
        System.out.println(maxProduct(22));
    }

    // Time: O(log n) - where n is the input value (number of digits is log10(n))
    // Space: O(1)
    public static int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n /= 10;
        }

        return max1 * max2;
    }
}
