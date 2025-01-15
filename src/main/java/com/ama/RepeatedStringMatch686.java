package com.ama;

public class RepeatedStringMatch686 {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd", "cdabcdab"));
    }

    public static int repeatedStringMatch(String a, String b) {
        int repeated = 1;
        StringBuilder sBuilder = new StringBuilder(a);

        while (!sBuilder.toString().contains(b) && (sBuilder.length() < b.length() + a.length())) {
            sBuilder.append(a);
            repeated++;
        }

        if (sBuilder.toString().contains(b)) {
            return repeated;
        } else {
            return -1;
        }
    }
}

