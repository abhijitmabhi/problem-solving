package com.ama;

public class ReversePrefixOfWord2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcd", 'z'));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder strBdr = new StringBuilder();
        int index = word.indexOf(ch);

        if (index == -1)
            return word;

        int i = index;
        while (i >= 0){
            strBdr.append(word.charAt(i));
            i--;
        }

        strBdr.append(word.substring(index+1));

        return strBdr.toString();
    }
}
