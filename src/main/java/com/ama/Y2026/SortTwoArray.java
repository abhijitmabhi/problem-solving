package com.ama.Y2026;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortArr3(new int[] {5, 5, 7, 2}, new int[] {3, 6, 2, 8})));
    }

    public static int[] shortArr(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        Arrays.sort(result);

        return result;
    }

    public static int[] shortArr2(int[] a, int[] b) {

        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
    }

    // Bubble Sort
    public static int[] shortArr3(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}
