package com.ama;

import java.util.HashMap;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> myHash = new HashMap<>();
        myHash.put('I', 1);
        myHash.put('V', 5);
        myHash.put('X', 10);
        myHash.put('L', 50);
        myHash.put('C', 100);
        myHash.put('D', 500);
        myHash.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && myHash.get(s.charAt(i)) < myHash.get(s.charAt(i + 1))) {
                result -= myHash.get(s.charAt(i));
            } else {
                result += myHash.get(s.charAt(i));
            }
        }

        return result;

    }
}
