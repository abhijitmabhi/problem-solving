package com.ama;

public class MaximumDifferenceByRemappingADigit2566 {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
    }

    private static int minMaxDifference(int num) {
        String strNum = String.valueOf(num);

        int minNum = Integer.parseInt(strNum.replace(strNum.charAt(0), '0'));

        for (char digit : strNum.toCharArray()) {
            if (digit != '9') {
                return Integer.parseInt(strNum.replace(digit, '9')) - minNum;
            }
        }

        return num - minNum;
    }
}
