package com.ama;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("}["));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> myStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                myStack.push(')');
            } else if (c == '{') {
                myStack.push('}');
            } else if (c == '[') {
                myStack.push(']');
            } else if (myStack.empty() || myStack.pop() != c) {
                return false;
            }
        }

        return myStack.empty();
    }
}

