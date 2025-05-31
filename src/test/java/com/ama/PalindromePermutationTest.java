package com.ama;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromePermutationTest {

    @Test
    void testValidPermutations() {
        assertTrue(PalindromePermutation266.isPalindromePermutation("aab"));
        assertTrue(PalindromePermutation266.isPalindromePermutation("racecar"));
    }

    @Test
    void testInvalidPermutations() {
        assertFalse(PalindromePermutation266.isPalindromePermutation("abc"));
        assertFalse(PalindromePermutation266.isPalindromePermutation("aabc"));
    }

}
