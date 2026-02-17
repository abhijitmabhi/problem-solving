package com.ama.Y2026;

import java.util.HashMap;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "adq"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (hashMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
