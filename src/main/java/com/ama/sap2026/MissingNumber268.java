package com.ama.sap2026;

public class MissingNumber268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    private static int missingNumber(int[] nums) {
        int[] numArr = new int[nums.length + 1];

        for (int n : nums) {
            numArr[n]++;
        }

        for (int n = 0; n < nums.length; n++) {
            if (numArr[n] == 0) {
                return n;
            }
        }

        return -1;
    }
}
