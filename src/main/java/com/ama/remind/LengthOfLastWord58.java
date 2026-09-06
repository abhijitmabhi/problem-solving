package com.ama.remind;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("look at the noon "));
    }

    // Time: O(n)
    // Space: O(1)
    public static int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int count = 0;

        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        while (right >= 0 && s.charAt(right) != ' ') {
            count++;
            right--;
        }

        return count;
    }
}
