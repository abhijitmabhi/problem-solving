package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnIndicesOfTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expectedIndices = {0, 1};

        int[] result = twoSum.twoSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(expectedIndices);
    }

    @Test
    public void shouldHandleNegativeNumbers() {
        int[] nums = {-1, 0};
        int target = -1;

        int[] expectedIndices = {0, 1};

        int[] result = twoSum.twoSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(expectedIndices);
    }

    @Test
    public void shouldThrowIllegalArgumentException() {

        int target = 10;

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(null, target));

        assertEquals("Invalid input", result.getMessage());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNoSolutionFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 10;

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
        assertEquals("No solution found", result.getMessage());
    }

}