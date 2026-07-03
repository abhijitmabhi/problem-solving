package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {
    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    public void shouldReturnSumOfMaxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void shouldReturnSumOfMaxSubArrayWhenInputIsOneElementArray() {
        int[] nums = {1};
        assertEquals(1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void shouldReturnSumOfMaxSubArrayWhenInputsAreNegative() {
        int[] nums = {-1,-2,-3};
        assertEquals(-1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(null));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsEmpty() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void shouldReturnSumOfMaxSubArrayWhenInputIsAllPositive() {
        int[] nums = {1,2,3,4,5};
        assertEquals(15, maximumSubarray.maxSubArray(nums));
    }

}