package com.ama;

public class RepeatedSubstringPattern459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaa"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            String subS = s.substring(0,i+1);

            int length = s.length() / subS.length();
            stringBuilder.append(subS.repeat(length));

            if(stringBuilder.toString().equals(s)){
                return true;
            }
        }

        return false;
    }
}
