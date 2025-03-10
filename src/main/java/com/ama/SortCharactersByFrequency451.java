package com.ama;

import java.util.ArrayList;
import java.util.HashMap;

public class SortCharactersByFrequency451 {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
        }

        var myList = new ArrayList<>(myHashMap.entrySet());
        myList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder myStringBuilder = new StringBuilder();

        for (var elm : myList) {
            int c = 0;
            while (c < elm.getValue()) {
                myStringBuilder.append(elm.getKey());
                c++;
            }
        }

        return myStringBuilder.toString();
    }
}
