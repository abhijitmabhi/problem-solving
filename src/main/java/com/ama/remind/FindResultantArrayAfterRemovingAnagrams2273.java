package com.ama.remind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindResultantArrayAfterRemovingAnagrams2273 {
    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"abba", "baba", "bbaa", "cd", "cd"}));
    }

    // Time: O(n * k)
    // Space: O(n)
    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isBothAnagram(words[i], words[i - 1])) {
                result.add(words[i]);
            }
        }

        return result;
    }

    private static boolean isBothAnagram(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return map.values().stream().allMatch(x -> x == 0);
    }
}
