package com.ama.Y2026;

import java.util.HashMap;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
        }

        for (Character k : hashMap.keySet()) {
            if (hashMap.get(k) != 0) {
                return false;
            }
        }

        return true;
    }
}
