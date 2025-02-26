package com.ama;

public class LongestUncommonSubsequenceI521 {
    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc"));
    }

    public static int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        else {
            return Math.max(a.length(), b.length());
        }
    }
}
