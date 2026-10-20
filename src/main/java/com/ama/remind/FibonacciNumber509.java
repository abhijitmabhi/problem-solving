package com.ama.remind;

public class FibonacciNumber509 {
    public static void main(String[] args) {
        System.out.println(fib2(4));
    }

    // Time: O(2^n)
    // Space: O(n)
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // Time: O(n)
    // Space: O(n)
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fibArr = new int[n + 1];

        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        return fibArr[n];
    }
}
