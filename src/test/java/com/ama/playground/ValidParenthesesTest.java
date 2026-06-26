package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void shouldReturnTrueWhenParenthesesIsValid() {
        String s = "(){}";

        boolean result = validParentheses.isValidParentheses(s);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenParenthesesIsNotValid() {
        String s = "()[";

        boolean result = validParentheses.isValidParentheses(s);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenParenthesesInputIsEmpty() {
        String s = "";

        boolean result = validParentheses.isValidParentheses(s);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenParenthesesInputIsNull() {
        boolean result = validParentheses.isValidParentheses(null);

        assertFalse(result);
    }

}