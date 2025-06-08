package com.ama;

import java.util.HashMap;

public class CheckWhetherTwoStringsAreAlmostEquivalent2068 {
    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("abcdeef", "abcdeef"));
    }

    private static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for (char c : word1.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) - 1);
        }

        for (var k : myHashMap.entrySet()) {
            if (Math.abs(k.getValue()) > 3) {
                return false;
            }
        }

        return true;
    }
}
