package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void shouldReturnTrueForValidPalindrome() {
        String c = "Was it a car or a cat I saw?";

        boolean result = validPalindrome.isPalindrome(c);

        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForEmptyString() {
        String c = "";

        boolean result = validPalindrome.isPalindrome(c);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForInvalidPalindrome() {
        String c = "tab a cat";

        boolean result = validPalindrome.isPalindrome(c);

        assertFalse(result);
    }



}