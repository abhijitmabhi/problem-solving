package com.ama.remind;

public class MaximumNumberOfWordsFoundInSentences2114 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    // Time Complexity: O(n*m)
    // Space Complexity: O(m)
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String s : sentences) {
            maxWords = Math.max(maxWords, s.split("\\s+").length);
        }

        return maxWords;
    }
}
