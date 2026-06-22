package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    TwoSum twoSum = new TwoSum();

    @Test
    public void shouldReturnIndicesOfTwoSum() {
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        int[] expectedIndices = {0, 1};

        int[] result = twoSum.twoSum(nums, target);

        int[] expectedIndicesCopy = expectedIndices.clone();
        int[] resultCopy = result.clone();

        Arrays.sort(expectedIndicesCopy);
        Arrays.sort(resultCopy);

        assertArrayEquals(expectedIndicesCopy, resultCopy);
    }
}