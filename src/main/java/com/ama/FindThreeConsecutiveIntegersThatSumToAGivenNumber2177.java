package com.ama;

import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumber2177 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfThree(0)));
    }

    public static long[] sumOfThree(long num) {
        long[] result = new long[3];

        if (num % 3 == 0) {
            long x = num / 3;
            result[0] = x - 1;
            result[1] = x;
            result[2] = x + 1;

            return result;
        } else {
            return new long[]{};
        }

    }
}
