package com.ama.playground;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAdjacentPairsTest {
    Set<String> set = Set.of("AB", "BA", "CD", "DC");
    private final RemoveAdjacentPairs removeAdjacentPairs = new RemoveAdjacentPairs(set);

    @Test
    public void shouldRemoveAdjacentPairs() {
        String s = "CBACD";

        assertEquals("C", removeAdjacentPairs.removeAdjacentPairs(s));
    }

    @Test
    public void shouldReturnEmptyStringWhenNoAdjacentPairs() {
        String s = "ABCD";

        assertEquals("", removeAdjacentPairs.removeAdjacentPairs(s));
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> removeAdjacentPairs.removeAdjacentPairs(null));
    }

    @Test
    public void shouldReturnSingleCharWhenInputIsSingleChar() {
        String s = "A";

        assertEquals("A", removeAdjacentPairs.removeAdjacentPairs(s));
    }

    @Test
    public void shouldReturnEmptyStringWhenInputIsEmpty() {
        String s = "";

        assertEquals("", removeAdjacentPairs.removeAdjacentPairs(s));
    }

}