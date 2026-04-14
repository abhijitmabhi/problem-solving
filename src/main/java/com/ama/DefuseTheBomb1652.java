package com.ama;

import java.util.Arrays;

public class DefuseTheBomb1652 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{2, 4, 9, 3}, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];

        if (k == 0) {
            Arrays.fill(code, 0);
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                result[i] = calculatePositive(code, i, k);
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                result[i] = calculateNegative(code, i, k);
            }
        }

        return result;
    }

    private static int calculateNegative(int[] code, int index, int k) {
        int sum = 0;
        index--;
        for (int i = 0; i < Math.abs(k); i++) {
            if (index < 0) {
                sum += code[Math.abs(code.length + index)];
                index--;
            } else {
                sum += code[index--];
            }
        }
        return sum;
    }

    private static int calculatePositive(int[] code, int index, int k) {
        int sum = 0;
        index++;
        for (int i = 0; i < k; i++) {
            if (index < code.length) {
                sum += code[index++];
            } else {
                sum += code[Math.abs(code.length - index)];
                index++;
            }
        }
        return sum;
    }
}
