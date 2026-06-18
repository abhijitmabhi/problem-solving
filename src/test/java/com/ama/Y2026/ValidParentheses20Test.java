package com.ama.Y2026;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParentheses20Test {

    @Test
    @DisplayName("Should return true when parenthesis is valid")
    public void shouldReturnTrueWhileValidParentheses() {
        // Given
        String s = "(())[]{}";

        // When
        var result = ValidParentheses20.isValid(s);

        // Then
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return false when parenthesis is not valid")
    public void shouldReturnFalseWhileValidParentheses() {
        // Given
        String s = "(())[{}";

        // When
        var result = ValidParentheses20.isValid(s);

        // Then
        assertFalse(result);
    }
}
