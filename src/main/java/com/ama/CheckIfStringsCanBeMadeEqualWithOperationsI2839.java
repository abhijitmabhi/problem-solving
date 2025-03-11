package com.ama;

public class CheckIfStringsCanBeMadeEqualWithOperationsI2839 {
    public static void main(String[] args) {
        System.out.println(canEqual("bnxw", "bwxn"));
    }

    public static boolean canEqual(String s1, String s2) {
        boolean evenCheck = s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2) || s1.charAt(2) == s2.charAt(0) && s1.charAt(0) == s2.charAt(2);
        boolean oddCheck = s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3) || s1.charAt(3) == s2.charAt(1) && s1.charAt(1) == s2.charAt(3);

        return evenCheck && oddCheck;
    }

}
