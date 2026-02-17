package com.ama.Y2026;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    private static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hashMap = new HashMap<>();
        String[] strArr = s.split(" ");

        if (pattern.length() != strArr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!hashMap.containsKey(pattern.charAt(i))) {
                if (hashMap.containsValue(strArr[i])) {
                    return false;
                }
                hashMap.put(pattern.charAt(i), strArr[i]);
            } else {
                if (!Objects.equals(hashMap.get(pattern.charAt(i)), strArr[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
