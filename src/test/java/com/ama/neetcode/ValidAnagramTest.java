package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void shouldReturnTrue() {
        String s = "anagram", t = "nagaram";

        boolean result = validAnagram.isAnagram(s, t);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse() {
        String s = "rat", t = "car";

        boolean result = validAnagram.isAnagram(s, t);

        assertFalse(result);
    }
}