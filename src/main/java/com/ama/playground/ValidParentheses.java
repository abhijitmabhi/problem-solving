package com.ama.playground;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValidParentheses(String s) {
        if (s == null || s.isBlank()) {
            return false;
        }

        Stack<Character> stackForParentheses = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stackForParentheses.push(')');
            } else if (c == '{') {
                stackForParentheses.push('}');
            } else if (c == '[') {
                stackForParentheses.push(']');
            } else if (stackForParentheses.isEmpty() || stackForParentheses.pop() != c) {
                return false;
            }
        }

        return stackForParentheses.isEmpty();
    }
}
