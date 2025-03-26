package com.ama;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        List<String> list = Arrays.asList(words);
        Collections.reverse(list);

        return String.join(" ", words);
    }
}
