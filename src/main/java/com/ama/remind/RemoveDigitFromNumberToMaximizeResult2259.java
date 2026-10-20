package com.ama.remind;

public class RemoveDigitFromNumberToMaximizeResult2259 {
    public static void main(String[] args) {
        System.out.println(removeDigit("551", '5'));
    }

    // Time: O(n)
    // Space: O(1)
    public static String removeDigit(String number, char digit) {
        String max = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String curNum = number.substring(0, i) + number.substring(i + 1);
                if (curNum.compareTo(max) > 0) {
                    max = curNum;
                }
            }
        }

        return max;
    }
}
