package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void shouldReturnTrue() {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate.hasDuplicate(nums);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalse() {
        int[] nums = {1, 2, 3, 4};

        boolean result = containsDuplicate.hasDuplicate(nums);

        assertFalse(result);
    }

}