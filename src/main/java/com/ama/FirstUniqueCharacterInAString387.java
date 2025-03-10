package com.ama;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> myHashMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            myHashMap.put(c, myHashMap.getOrDefault(c, 0) + 1);
        }

        for (var ele : myHashMap.entrySet()) {

            if (ele.getValue() == 1)
                return s.indexOf(ele.getKey());
        }

        return -1;
    }
}
