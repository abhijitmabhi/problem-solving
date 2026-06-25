package com.ama.Y2026JUNE;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MicroBlogTest {

    MicroBlog microBlog = new MicroBlog();

    @Test
    public void shouldReturnTruncateStringWith5Char() {
        String input = "😛😛😛😛😛😛";
        String expected = "😛😛😛😛😛";
        String result = microBlog.truncate(input);

        assertEquals(expected, result);
        assertEquals(10, result.length());
    }

    @Test
    public void shouldReturnHello() {
        String input = "Hello Hallo";
        String expected = "Hello";
        String result = microBlog.truncate(input);

        assertEquals(expected, result);
    }
}
