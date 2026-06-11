package com.ama;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostCommonWord819 {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"b"}));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        List<String> normalize = Arrays.stream(paragraph.trim().toLowerCase().split("\\W+")).toList();
        List<String> bannedList = Arrays.stream(banned).toList();

        var words = normalize.stream()
                .filter(s -> !bannedList.contains(s))
                .toList();

        HashMap<String, Integer> myHashMap = new HashMap<>();

        for (String s : words) {
            myHashMap.put(s, myHashMap.getOrDefault(s, 0) + 1);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (var k : myHashMap.entrySet()){
            if(k.getValue() > maxValue){
                maxKey = k.getKey();
                maxValue = k.getValue();
            }
        }

        return maxKey;
    }
}
