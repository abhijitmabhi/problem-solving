package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {
    private final Palindrome palindrome = new Palindrome();

    @Test
    public void shouldReturnTrueWhenStringIsPalindrome() {
        String s = "madam";

        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotPalindrome() {
        String s = "hello";

        assertFalse(palindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnTrueWhenStringIsPalindromeWithSpecialCharacters() {
        String s = "A man, a plan, a canal: Panama";

        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> palindrome.isPalindrome(null));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsEmpty() {
        String s = "";

        assertTrue(palindrome.isPalindrome(s));
    }

    @Test
    public void shouldReturnTrueWhenStringHasOnlySpecialCharacters() {
        String s = " ,.!@#$%^&*()-_+={}[]|\\:";

        assertTrue(palindrome.isPalindrome(s));

    }

    @Test
    public void shouldReturnTrueWhenStringHasSingleCharacter() {
        String s = "A";

        assertTrue(palindrome.isPalindrome(s));
    }

}