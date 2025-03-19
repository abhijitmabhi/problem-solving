package com.ama;

public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] word = s.toCharArray();

        int leftPtr = 0;
        int rightPtr = s.length() - 1;

        while (leftPtr < rightPtr) {
            if (vowels.indexOf(word[leftPtr]) != -1 && vowels.indexOf(word[rightPtr]) != -1) {
                char temp = word[leftPtr];
                word[leftPtr] = word[rightPtr];
                word[rightPtr] = temp;

                leftPtr++;
                rightPtr--;
                continue;
            }

            if (vowels.indexOf(word[leftPtr]) == -1)
                leftPtr++;

            if (vowels.indexOf(word[rightPtr]) == -1)
                rightPtr--;

        }

        return new String(word);

    }
}
