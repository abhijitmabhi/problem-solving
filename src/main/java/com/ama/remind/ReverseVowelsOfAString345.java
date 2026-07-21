package com.ama.remind;

public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    // Time: O(n)
    // Space: O(1)
    public static String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        int left = 0;
        int right = s.length() - 1;

        char[] charArr = s.toCharArray();

        while (left < right) {
            if ((vowels.indexOf(charArr[left]) != -1) && (vowels.indexOf(charArr[right]) != -1)) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
            } else if (vowels.indexOf(charArr[left]) != -1) {
                right--;
                continue;
            } else if (vowels.indexOf(charArr[right]) != -1) {
                left++;
                continue;
            }

            left++;
            right--;
        }

        return String.valueOf(charArr);
    }
}
