package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoIntegerSumIITest {
    TwoIntegerSumII twoIntegerSumII = new TwoIntegerSumII();

    @Test
    public void shouldReturnTwoSum() {
        int[] numbers = {1,2,3,4};
        int target = 3;

        int[] expected = {1,2};

        int[] result = twoIntegerSumII.twoSum(numbers, target);

        assertArrayEquals(expected, result);
    }

}