package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnTwoIndicesOfTwoNumbersThatAddUpToTarget() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] expectedIndices = {0,1};

        int[] result = twoSum.twoSumIndices(nums, target);

        assertThat(result).containsExactlyInAnyOrder(expectedIndices);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumIndices(null, 0));
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumIndices(new int[]{}, 0));
    }

    @Test
    public void shouldThrowIllegalStateExceptionWhenNoSolutionFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 10;
    }

}