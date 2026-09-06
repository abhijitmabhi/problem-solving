package com.ama.remind;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge01Test {
    private final Challenge01 challenge01 = new Challenge01();

    @Test
    public void shouldReturnDistinctJobPosting() {
        var postings = List.of(new JobPosting("123", "Software Engineer", "CGI", "Berlin", 1785966243),
                new JobPosting("124", "Software Engineer", "CGI", "Berlin", 1785966243),
                new JobPosting("125", "Software Engineer", "CGI", "Berlin", 1785974568),
                new JobPosting("126", "Software Engineer", "IESE", "KL", 1785966243));


        var expected = List.of(new JobPosting("125", "Software Engineer", "CGI", "Berlin", 1785974568),
                new JobPosting("126", "Software Engineer", "IESE", "KL", 1785966243));

        var result = challenge01.deduplicate(postings);

        assertEquals(expected, result);
        assertEquals(2, result.size());
        assertEquals("125", result.stream().filter(x -> x.id().equals("125")).toList().getFirst().id());
    }
}