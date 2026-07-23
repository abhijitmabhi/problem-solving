package com.ama.remind;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("noon"));
    }

    // Time: O(n)
    // Space: O(1)
    public static int lengthOfLastWord(String s) {
        s = s.strip();
        int right = s.length() - 1;

        while (right > -1 && s.charAt(right) != ' ') {
            right--;
        }

        return s.length() - 1 - right;
    }
}
