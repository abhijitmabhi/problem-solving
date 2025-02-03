package com.ama;

public class Sqrtx69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int result = 0;
        int left = 0;
        int right = x;
        int m = 0;

        while (left <= right) {
            m = left + ((right - left) / 2);
            long square = (long) m * m;
            if (square > x) {
                right = m - 1;
            } else if (square < x) {
                left = m + 1;
                result = m;
            } else {
                return m;
            }
        }

        return result;
    }
}
