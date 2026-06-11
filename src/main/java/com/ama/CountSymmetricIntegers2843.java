package com.ama;

public class CountSymmetricIntegers2843 {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200, 1230));
    }

    private static int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (i < 100 && i % 11 == 0) {
                count++;
            } else {
                if (i >= 1000 && i < 10000) {
                    int d1 = i / 1000;
                    int d2 = (i / 100) % 10;
                    int d3 = (i / 10) % 10;
                    int d4 = i % 10;

                    if (d1 + d2 == d3 + d4) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
