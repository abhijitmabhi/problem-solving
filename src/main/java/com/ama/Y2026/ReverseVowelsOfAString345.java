package com.ama.Y2026;

public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {

        char[] strArr = s.toCharArray();

        int left = 0;
        int right = strArr.length - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.indexOf(strArr[left]) != -1 && vowels.indexOf(strArr[right]) != -1) {
                char temp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = temp;

                left++;
                right--;
            } else if (vowels.indexOf(strArr[left]) != -1) {
                right--;
            } else if (vowels.indexOf(strArr[right]) != -1) {
                left++;
            } else {
                left++;
                right--;
            }
        }

        return String.valueOf(strArr);
    }
}
