package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindDuplicatesTest {
    private final FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    public void shouldReturnDuplicateNumbers() {
        int[] nums = {1, 2, 5, 3, 2, 1, 1};

        int[] expected = {1, 2};

        int[] result = findDuplicates.duplicateNumbers(nums);

        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    public void shouldReturnEmptyArrayWhenNoDuplicateNumbers() {
        int[] nums = {1, 2, 5, 3};

        int[] expected = {};

        int[] result = findDuplicates.duplicateNumbers(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptyArrayWhenInputIsEmpty() {
        int[] nums = {};
        int[] expected = {};

        int[] result = findDuplicates.duplicateNumbers(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldThrowExceptionWhenInputIsNull() {
        IllegalArgumentException result =
                assertThrows(IllegalArgumentException.class, () -> findDuplicates.duplicateNumbers(null));

        assertEquals("Invalid input", result.getMessage());
    }

    @Test
    public void shouldThrowDuplicateNumbersWhenInputContainsNegativeNumbers() {
        int[] nums = {-1, 2, 5, 3, -1};

        int[] expected = {-1};

        int[] result = findDuplicates.duplicateNumbers(nums);

        assertArrayEquals(expected, result);
    }

}