package com.ama;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if (pattern.length() != str.length)
            return false;


        HashMap<Character, String> myHash = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!myHash.containsKey(pattern.charAt(i))) {
                if (myHash.containsValue(str[i])) {
                    return false;
                }
                myHash.put(pattern.charAt(i), str[i]);
            } else {
                if (!Objects.equals(myHash.get(pattern.charAt(i)), str[i])) {
                    return false;
                }
            }
        }

        return true;

    }
}
