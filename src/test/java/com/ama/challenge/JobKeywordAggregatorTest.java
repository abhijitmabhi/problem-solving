package com.ama.challenge;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JobKeywordAggregatorTest {
    private final JobKeywordAggregator jobKeywordAggregator = new JobKeywordAggregator();

    @Test
    public void shouldGetTopKKeyWords() {
        int k = 2;
        List<String> jobDescriptions = List.of("Java Developer with 5+ years of experience and python",
                "Hands on experience with Docker, Python");

        Set<String> keywordsDictionary = Set.of("java", "docker", "python");

        List<String> expected = List.of("docker", "python");

        var result = jobKeywordAggregator.getTopKKeywords(jobDescriptions, keywordsDictionary, k);

        assertEquals(2, result.size());
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}