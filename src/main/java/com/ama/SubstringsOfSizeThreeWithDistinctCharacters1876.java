package com.ama;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubstringsOfSizeThreeWithDistinctCharacters1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
    }

    public static int countGoodSubstrings(String s) {
        int result = 0;
        List<String> myList = new ArrayList<>();


        for (int i = 0; i < s.length() && i + 3 <= s.length(); i++) {
            myList.add(s.substring(i, i + 3));
        }

        result = myList.size();

        for (String str : myList) {
            HashSet<Character> myHashSet = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (!myHashSet.add(c)) {
                    result--;
                    break;
                }

            }
        }

        return result;
    }
}
