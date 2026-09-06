package com.ama.sap2026;

import java.util.Arrays;

public class FizzBuzz412 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(5)));
    }

    private static String[] fizzBuzz(int n) {
        String[] arr = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }

        return arr;
    }
}
