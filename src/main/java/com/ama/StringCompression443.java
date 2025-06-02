package com.ama;

public class StringCompression443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a'}));
    }

    private static int compress(char[] chars) {
        int first = 0;
        int last = 1;
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (last != chars.length && chars[i - 1] == chars[i]) {
                last++;
                count++;
            } else if (last == chars.length || chars[i - 1] != chars[i]) {
                chars[first++] = chars[i - 1];
                if (count >= 2) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[first++] = c;
                    }
                    count = 1;
                }
                last++;
            }

        }

        return first;
    }
}
