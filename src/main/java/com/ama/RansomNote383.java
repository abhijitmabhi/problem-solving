package com.ama;

import java.util.Arrays;

public class RansomNote383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }

    private static boolean canConstruct(String ransomeNote, String magazine) {
        char[] ransomeNoteArr = ransomeNote.toCharArray();
        char[] magazineArr = magazine.toCharArray();

        Arrays.sort(ransomeNoteArr);
        Arrays.sort(magazineArr);

        for (char c : ransomeNoteArr) {
            for (int i = 0; i < magazineArr.length; i++) {
                if (magazineArr[i] == c) {
                    magazineArr[i] = '\0';
                    break;
                }

                if (i == magazine.length() - 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
