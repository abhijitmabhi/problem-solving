package com.ama.Y2026;

import java.util.HashMap;

public class RomanToInteger13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        int result = 0;

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || hashMap.get(s.charAt(i)) >= hashMap.get(s.charAt(i + 1))) {
                result += hashMap.get(s.charAt(i));
            } else {
                result -= hashMap.get(s.charAt(i));
            }
        }

        return result;
    }
}
