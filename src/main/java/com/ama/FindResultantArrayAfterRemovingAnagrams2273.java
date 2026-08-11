package com.ama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams2273 {
    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    public static List<String> removeAnagrams(String[] words) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        char[] current = words[0].toCharArray();
        Arrays.sort(current);
        result.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            char[] curWord = words[i].toCharArray();
            Arrays.sort(curWord);
            if (Arrays.equals(current, curWord)) {
                continue;
            }
            result.add(words[i]);
            current = curWord;
        }

        return result;
    }
}
