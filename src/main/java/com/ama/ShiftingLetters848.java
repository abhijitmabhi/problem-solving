package com.ama;

import java.util.Arrays;

public class ShiftingLetters848 {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3,5,9}));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int shift = Arrays.stream(shifts, i, shifts.length).sum();

            char shiftedChar = getShiftedChar(s, i, shift);
            result.append(shiftedChar);
        }

        return result.toString();
    }

    private static char getShiftedChar(String s, int i, int shift) {
        if ((char) (s.charAt(i) + shift) > 'z') {
            shift = (((s.charAt(i) + shift) - 'a') % 26);
            return (char) ('a' + shift);
        }
        return (char) (s.charAt(i) + shift);
    }
}
