package com.ama;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int x){
        String numberString = String.valueOf(x);
        if(numberString.length() == 1){
            return true;
        }

        int leftPtr = 0;
        int rightPtr = numberString.length()-1;

        while (leftPtr < rightPtr){
            if (numberString.charAt(leftPtr) != numberString.charAt(rightPtr)){
                return false;
            }
            leftPtr++;
            rightPtr--;
        }

        return true;
    }
}
