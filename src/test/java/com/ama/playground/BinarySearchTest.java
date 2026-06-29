package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {
    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldReturnIndexOfTargetedElement() {
        int[] nums = {-1, 0, 3, 5, 9, 12};

        assertEquals(4, binarySearch.findIndexFromSortedArray(nums, 9));
    }

    @Test
    public void shouldReturnMinusOneWhenElementNotFound() {
        int[] nums = {-1, 0, 3, 5, 9, 12};

        assertEquals(-1, binarySearch.findIndexFromSortedArray(nums, 2));
    }

    @Test
    public void shouldReturnIndexWhenOnlyOneElement() {
        int[] nums = {1};

        assertEquals(0, binarySearch.findIndexFromSortedArray(nums, 1));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> binarySearch.findIndexFromSortedArray(null, -1));

        assertEquals("array cannot be null", result.getMessage());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsEmpty() {
        int[] nums = {};

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> binarySearch.findIndexFromSortedArray(nums, -1));

        assertEquals("array cannot be empty", result.getMessage());
    }

    @Test
    public void shouldReturnIndexWhenTargetedElementIsFirstElement() {
        int[] nums = {1, 6, 9};

        assertEquals(0, binarySearch.findIndexFromSortedArray(nums, 1));
    }

    @Test
    public void shouldReturnIndexWhenTargetedElementIsLastElement() {
        int[] nums = {1, 6, 9};

        assertEquals(2, binarySearch.findIndexFromSortedArray(nums, 9));
    }

}