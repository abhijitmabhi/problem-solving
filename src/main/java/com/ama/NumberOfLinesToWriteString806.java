package com.ama;

import java.util.Arrays;
import java.util.HashMap;

public class NumberOfLinesToWriteString806 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa")));
    }

    // 2144

    public static int[] numberOfLines(int[] widths, String s) {
        int [] result = new int[2];
        result[0] = 0;
        int line = 0;

        HashMap<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < 26; i++){
            char letter = (char) ('a' + i);
            alphabet.put(letter,i);
        }

        for (int i = 0; i < s.length(); i++) {
            int index = alphabet.get(s.charAt(i));
            if(result[0] < 100){
                int rr =  result[0] + widths[index];
                if (rr > 100){
                    line++;
                    result[0] = widths[index];
                    continue;
                }
                result[0] += widths[index];
            }else {
                line++;
                result[0] = widths[index];
            }
        }

        result[1] = result[0];
        result[0] = line + 1;

        return result;
    }
}
