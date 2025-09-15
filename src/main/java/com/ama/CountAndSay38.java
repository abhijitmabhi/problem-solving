package com.ama;

public class CountAndSay38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
    }

    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = finalString(s);
        }

        return s;
    }

    private static String finalString(String s) {
        char p = s.charAt(0);
        int count = 1;

        StringBuilder strBdr = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            if (p == s.charAt(i))
                count++;
            else {
                strBdr.append(count);
                strBdr.append(p);
                p = s.charAt(i);
                count = 1;
            }
        }

        strBdr.append(count);
        strBdr.append(p);

        return strBdr.toString();
    }
}
