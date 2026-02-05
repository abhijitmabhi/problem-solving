package com.ama;

public class ToLowerCase709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
