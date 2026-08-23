package com.ama.sap2026;

public class LengthofLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    private static int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int count = 0;

        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        while (right >= 0 && s.charAt(right) != ' ') {
            right--;
            count++;
        }

        return count;
    }
}
