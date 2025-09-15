package com.ama;

public class MinimumStringLengthAfterRemovingSubstrings2696 {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }

    private static int minLength(String s) {
        StringBuilder strBdr = new StringBuilder(s);

        while (strBdr.indexOf("AB") != -1 || strBdr.indexOf("CD") != -1) {
            if (strBdr.indexOf("AB") != -1) {
                strBdr.delete(strBdr.indexOf("AB"), strBdr.indexOf("AB") + 2);
            } else if (strBdr.indexOf("CD") != -1) {
                strBdr.delete(strBdr.indexOf("CD"), strBdr.indexOf("CD") + 2);
            }
        }

        return strBdr.length();

    }
}
