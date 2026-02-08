package com.ama.Y2026;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MajorityElement169Test {

    @Test
    @DisplayName("Should return 5 when majority element is 5")
    void testMajorityElementWithFive() {
        // Given
        int[] nums = {6, 5, 5};

        // When
        int result = MajorityElement169.majorityElement(nums);

        // Then
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("Should return 3 when array has single element")
    void testSingleElement() {
        // Given
        int[] nums = {3};

        // When
        int result = MajorityElement169.majorityElement(nums);

        // Then
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Should return 2 when majority element appears more than n/2 times")
    void testMajorityElementMultiple() {
        // Given
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // When
        int result = MajorityElement169.majorityElement(nums);

        // Then
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return majority element when it appears consecutively")
    void testConsecutiveMajority() {
        // Given
        int[] nums = {1, 1, 1, 2, 3};

        // When
        int result = MajorityElement169.majorityElement(nums);

        // Then
        assertThat(result).isEqualTo(1);
    }
}