package com.ama.remind;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzz412Test {

    @Test
    public void shouldReturnFizzBuzzCorrectly() {
        List<String> expected = List.of("2", "1", "Fizz");

        List<String> result = FizzBuzz412.fizzBuzz(3);

        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
        assertEquals(3, result.size());
        assertTrue(result.contains("Fizz"));
        assertEquals(1, result.stream().filter(x -> x.equals("Fizz")).count());
    }

}