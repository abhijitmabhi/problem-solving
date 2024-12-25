package com.ama;

public class MergeStringsAlternately1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abuuuu", "pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder myString = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for(int i=0; i < maxLength; i++){
            if(i < word1.length()){
                myString.append(word1.charAt(i));
            }

            if(i < word2.length()){
                myString.append(word2.charAt(i));
            }
        }

        return myString.toString();
    }
}
