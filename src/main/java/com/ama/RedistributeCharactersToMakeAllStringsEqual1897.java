package com.ama;

import java.util.*;

public class RedistributeCharactersToMakeAllStringsEqual1897 {
    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc","aabc","bc"}));
    }

    private static boolean makeEqual(String[] words) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> k : hashMap.entrySet()){
            if(k.getValue() % words.length != 0){
                return false;
            }
        }

        return true;
    }
}
