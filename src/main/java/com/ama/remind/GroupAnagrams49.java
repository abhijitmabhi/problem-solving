package com.ama.remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);

            map.computeIfAbsent(String.valueOf(charWord), k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
