package com.ama;

public class FindTheIndexOfTheFirstOccurrenceInAString28 {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);

    }

}
