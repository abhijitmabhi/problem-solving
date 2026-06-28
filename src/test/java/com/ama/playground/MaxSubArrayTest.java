package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxSubArrayTest {
    private final MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    public void shouldReturnSumOfMaxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maxSubArray.maxSubArray(nums));
    }

    @Test
    public void shouldReturnSumOfMaxSubArrayWhenInputIsOneElementArray() {
        int[] nums = {1};
        assertEquals(1, maxSubArray.maxSubArray(nums));
    }

    @Test
    public void shouldReturnSumOfMaxSubArrayWhenInputsAreNegative() {
        int[] nums = {-1, -2, -3};
        assertEquals(-1, maxSubArray.maxSubArray(nums));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> maxSubArray.maxSubArray(null));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsEmpty() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> maxSubArray.maxSubArray(nums));
    }

}