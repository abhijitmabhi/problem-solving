package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void shouldReturnTrueWhenInputHasDuplicate() {
        int[] nums = {1,2,3,1};

        assertTrue(containsDuplicate.isContainsDuplicate(nums));
    }

    @Test
    public void shouldReturnFalseWhenInputHasNoDuplicate() {
        int[] nums = {7,3,1};

        assertFalse(containsDuplicate.isContainsDuplicate(nums));
    }

    @Test
    public void shouldReturnTrueWhenInputHasMultipleDuplicate() {
        int[] nums = {1,2,3,1,2};

        assertTrue(containsDuplicate.isContainsDuplicate(nums));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> containsDuplicate.isContainsDuplicate(null));
    }

    @Test
    public void shouldReturnFalseWhenInputHasSingleElement() {
        int[] nums = {1};

        assertFalse(containsDuplicate.isContainsDuplicate(nums));
    }

    @Test
    public void shouldReturnFalseWhenInputIsAnEmptyArray() {
        int[] nums = {};

        assertFalse(containsDuplicate.isContainsDuplicate(nums));
    }

}