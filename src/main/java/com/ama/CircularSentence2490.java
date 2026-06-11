package com.ama;

import java.util.Objects;

public class CircularSentence2490 {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] sentenceArr = sentence.split(" ");

        if (!Objects.equals(sentenceArr[0].charAt(0), sentenceArr[sentenceArr.length - 1].charAt(sentenceArr[sentenceArr.length - 1].length() - 1)))
            return false;

        for (int i = 0; i < sentenceArr.length - 1; i++) {
            if (!Objects.equals(sentenceArr[i].charAt(sentenceArr[i].length()-1), sentenceArr[i+1].charAt(0)))
                return false;
        }

        return true;
    }

}
