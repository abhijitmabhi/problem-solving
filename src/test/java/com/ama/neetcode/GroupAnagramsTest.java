package com.ama.neetcode;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void shouldReturnGroupedAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(List.of("ate", "eat", "tea"), List.of("nat", "tan"), List.of("bat"));

        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        result = normalize(result);
        expected = normalize(expected);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnGroupedAnagramsForSingleWord() {
        String[] strs = {"a"};
        List<List<String>> expected = List.of(List.of("a"));

        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptyList() {
        String[] strs = {};
        List<List<String>> expected = List.of();

        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        result = normalize(result);
        expected = normalize(expected);
        assertEquals(expected, result);
    }

    private List<List<String>> normalize(List<List<String>> result) {
        return result
                .stream()
                .map(group -> group.stream().sorted().collect(Collectors.toList()))
                .sorted(Comparator.comparing(List::getFirst))
                .collect(Collectors.toList());
    }

}