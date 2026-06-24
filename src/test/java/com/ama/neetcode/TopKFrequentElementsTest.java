package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TopKFrequentElementsTest {
    TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    public void shouldReturnTopKFrequentElements() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};

        int[] result = topKFrequentElements.topKFrequent(nums, k);

        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    public void shouldReturnTopKFrequentElements2() {
        int[] nums = {1, 2};
        int k = 2;
        int[] expected = {1, 2};

        int[] result = topKFrequentElements.topKFrequent(nums, k);

        assertThat(result).containsExactlyInAnyOrder(expected);
    }

}