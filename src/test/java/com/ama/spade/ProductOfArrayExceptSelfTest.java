package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductOfArrayExceptSelfTest {
    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void shouldReturnProductOfArrayExceptSelf() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnProductOfArrayExceptSelfWhenInputIsOneElementArray() {
        int[] nums = {2};
        int[] expected = {1};

        int[] result = productOfArrayExceptSelf.productExceptSelf(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNullOrEmpty() {

        assertThrows(IllegalArgumentException.class, () -> productOfArrayExceptSelf.productExceptSelf(null));
        assertThrows(IllegalArgumentException.class, () -> productOfArrayExceptSelf.productExceptSelf(new int[]{}));
    }

    @Test
    public void shouldReturnCorrectResultWhenInputContainsNegatives() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};

        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(nums));
    }

}