package com.ama;

import java.util.HashMap;

public class FindTheDifference389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference2("a", "aa"));
    }

    public static char findTheDifference(String s, String t){
        char[] shuffle = t.toCharArray();

        for (char c : s.toCharArray()){
            for (int i = 0; i < shuffle.length; i++){
                if(c == shuffle[i]){
                    shuffle[i] = '-';
                    break;
                }
            }
        }

        for (char c : shuffle){
            if(c != '-')
                return c;
        }

        return '\0';
    }

    public static char findTheDifference2(String s, String t){
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) - 1);

            if(charCounts.get(c) < 0)
                return c;
        }

        return '\0';
    }
}
