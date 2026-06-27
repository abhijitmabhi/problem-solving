package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstNonRepeatingCharTest {
    private final FirstNonRepeatingChar firstNonRepeatingChar = new FirstNonRepeatingChar();

    @Test
    public void shouldReturnFirstNonRepeatingChar() {
        String s = "leetcode";
        assertEquals('l', firstNonRepeatingChar.firstNonRepeatingChar(s));
    }

    @Test
    public void shouldReturnMinusWhenNoNonRepeatingChar() {
        String s = "acabbc";
        assertEquals('-', firstNonRepeatingChar.firstNonRepeatingChar(s));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        IllegalArgumentException result =
                assertThrows(IllegalArgumentException.class, () -> firstNonRepeatingChar.firstNonRepeatingChar(null));

        assertEquals("Invalid input", result.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenInputIsEmpty() {
        String s = "";

        assertEquals('-', firstNonRepeatingChar.firstNonRepeatingChar(s));
    }

    @Test
    public void shoudReturnFirstNonRepeatingCharWhenInputIsSingleChar() {
        String s = "s";
        assertEquals('s', firstNonRepeatingChar.firstNonRepeatingChar(s));
    }

}