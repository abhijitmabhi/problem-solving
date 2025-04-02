package com.ama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInAString2785 {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        char[] word = s.toCharArray();
        String vowel = "AEIOUaeiou";
        List<Character> vowelList = new ArrayList<>();

        for (char c : word) {
            if (vowel.indexOf(c) != -1) {
                vowelList.add(c);
            }
        }

        Collections.sort(vowelList);

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(word[i]) != -1) {
                word[i] = vowelList.getFirst();
                vowelList.removeFirst();
            }
        }

        return new String(word);
    }
}
