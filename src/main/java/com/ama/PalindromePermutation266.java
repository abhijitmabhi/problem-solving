package com.ama;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation266 {
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation("aabbccdde"));
    }

    public static boolean isPalindromePermutation(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Character, Integer> k : hashMap.entrySet()) {
            if (k.getValue() % 2 != 0) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;

    }

}

// Time: O(N)
// Space: O(N)
