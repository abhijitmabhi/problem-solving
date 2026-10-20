package com.ama.sap2026;

public class ReverseVowelsofaString345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    private static String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char[] strArr = s.toCharArray();

        int left = 0;
        int right = strArr.length - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(strArr[left]) == -1)
                left++;

            while (left < right && vowels.indexOf(strArr[right]) == -1)
                right--;


            char temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(strArr);
    }
}
