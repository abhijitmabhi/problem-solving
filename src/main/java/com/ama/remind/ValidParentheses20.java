package com.ama.remind;

import java.util.Stack;

public class ValidParentheses20 {
    // Time Complexity: O(n)
    // Space Complexity: 0(n)
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> storeParentheses = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                storeParentheses.push(')');
            } else if (c == '{') {
                storeParentheses.push('}');
            } else if (c == '[') {
                storeParentheses.push(']');
            } else {
                if (storeParentheses.isEmpty() || storeParentheses.pop() != c) {
                    return false;
                }
            }
        }

        return storeParentheses.isEmpty();
    }
}
