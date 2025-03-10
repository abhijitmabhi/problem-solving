package com.ama;

import java.util.Arrays;
import java.util.HashSet;

public class ShortestDistanceToACharacter821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        HashSet<Integer> myHash = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                myHash.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int minDistance = Integer.MAX_VALUE;
            result[i] = minDistance;

            for (var h : myHash) {
                result[i] = Math.min(result[i], Math.abs(h - i));
            }
        }

        return result;

    }
}
