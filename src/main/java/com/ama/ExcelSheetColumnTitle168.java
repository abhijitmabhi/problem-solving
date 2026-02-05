package com.ama;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }

    public static String convertToTitle(int columnNumber) {
        int num = columnNumber;
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            num--;
            result.insert(0, (char) ('A' + (num % 26)));
            num /= 26;
        }

        return result.toString();
    }
}
