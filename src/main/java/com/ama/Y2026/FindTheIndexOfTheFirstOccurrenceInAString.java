package com.ama.Y2026;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(findIndex("sadbutsad", "sad"));
    }

    public static int findIndex(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }

        return -1;
    }
}
