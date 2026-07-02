package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void shouldReturnTrueWhenPalindromeIsValid() {
        String s = " A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnTrueWhenStringIsEmpty() {
        String s = "";

        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnTrueWhenStringIsSingleChar() {
        String s = "A";

        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnFalseWhenPalindromeIsNotValid() {
        String s = "race a car";

        assertFalse(validPalindrome.isPalindrome(s));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> validPalindrome.isPalindrome(null));
    }

}