package com.ama;

import java.util.HashMap;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egt", "add"));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> myHashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!myHashMap.containsKey(s.charAt(i))) {
                if(myHashMap.containsValue(t.charAt(i))){
                    return false;
                }
                myHashMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (myHashMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
