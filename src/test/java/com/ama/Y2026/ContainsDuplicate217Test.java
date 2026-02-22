package com.ama.Y2026;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicate217Test {

    @Test
    public void returnTrueIfValueAppearsAtLeastTwice() {
        // given
        int[] nums = new int[] {1, 2, 3, 1};

        // when
        boolean result = ContainsDuplicate217.containsduplicate(nums);

        // then
        assertTrue(result);
    }

    @Test
    public void returnFalseIfValueDoesNotAppearsTwice() {
        // given
        int[] nums = new int[] {1, 2, 3};

        // when
        boolean result = ContainsDuplicate217.containsduplicate(nums);

        // then
        assertFalse(result);
    }
}
