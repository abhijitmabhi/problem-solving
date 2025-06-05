package com.ama;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation266 {
    public static void main(String[] args) {
        System.out.println(isPalindromePermutation2("aabbccddef"));
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

    public static boolean isPalindromePermutation2(String s) {
        int[] char_counts = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < char_counts.length; i++) {
            count += char_counts[i] % 2;
        }
        return count <= 1;
    }

}

// Time: O(N)
// Space: O(N)
