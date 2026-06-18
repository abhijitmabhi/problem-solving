package com.ama.Y2026JUNE;

public class MicroBlog {

    public String truncate(String input) {
        int realLength = input.codePointCount(0, input.length());

        if (realLength > 5) {
            int lastIndex = input.offsetByCodePoints(0, 5);

            return input.substring(0, lastIndex);
        }

        return input;
    }
}
