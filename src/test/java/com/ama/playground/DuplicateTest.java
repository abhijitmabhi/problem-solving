package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DuplicateTest {
    private final Duplicate duplicate = new Duplicate();

    @Test
    public void shouldReturnTrueWhenArrayHasDuplicateElement() {
        int[] nums = {1, 2, 3, 1};

        assertTrue(duplicate.hasDuplicateInArray(nums));
    }

    @Test
    public void shouldReturnFalseWhenArrayHasNoDuplicateElement() {
        int[] nums = {1, 2, 3, 4};

        assertFalse(duplicate.hasDuplicateInArray(nums));
    }

    @Test
    public void shouldReturnTrueWhenArrayHasOneElementMoreThanTwoTimes() {
        int[] nums = {1, 2, 2, 4, 2, 2};

        assertTrue(duplicate.hasDuplicateInArray(nums));
    }

    @Test
    public void shouldReturnFalseWhenArrayHasNoElement() {
        int[] nums = {};

        assertFalse(duplicate.hasDuplicateInArray(nums));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputArrayIsNull() {
        assertThrows(IllegalArgumentException.class, () -> duplicate.hasDuplicateInArray(null));
    }

    @Test
    public void shouldReturnFalseWhenArrayHasSingleElement() {
        int[] nums = {1};

        assertFalse(duplicate.hasDuplicateInArray(nums));
    }

}