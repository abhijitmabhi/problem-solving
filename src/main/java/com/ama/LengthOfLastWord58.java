package com.ama;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
