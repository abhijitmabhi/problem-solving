package com.ama.Y2026;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidParentheses20Test {

    @Test
    @DisplayName("Should return true when parenthesis is valid")
    public void shouldReturnTrueWhileValidParentheses() {
        // Given
        String s = "(())[]{}";

        // When
        var result = ValidParentheses20.isValid(s);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Should return false when parenthesis is not valid")
    public void shouldReturnFalseWhileValidParentheses() {
        // Given
        String s = "(())[{}";

        // When
        var result = ValidParentheses20.isValid(s);

        // Then
        assertThat(result).isFalse();
    }
}
