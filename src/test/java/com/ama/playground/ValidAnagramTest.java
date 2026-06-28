package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void shouldReturnTrueWhenAnagramIsValid() {
        String s = "anagram", t = "nagaram";

        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    public void shouldReturnFalseWhenAnagramIsNotValid() {
        String s = "hello", t = "world";

        assertFalse(validAnagram.isAnagram(s, t));
    }

    @Test
    public void shouldReturnFalseWhenAnagramIsNotSameLength() {
        String s = "a", t = "world";

        assertFalse(validAnagram.isAnagram(s, t));
    }

    @Test
    public void shouldReturnTrueWhenBothAreEmpty() {
        String s = "", t = "";

        assertTrue(validAnagram.isAnagram(s, t));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        String s = null, t = null;
        assertThrows(IllegalArgumentException.class, () -> validAnagram.isAnagram(s, t));
    }
}