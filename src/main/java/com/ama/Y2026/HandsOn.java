package com.ama.Y2026;

import java.util.List;

public class HandsOn {
    public static void main(String[] args) {
        var myList = List.of("Alex", "Bob", "Charlie");

        myList.stream().filter(s -> s.length() > 3).map(String::toUpperCase).forEach(System.out::println);
    }

    static String handle(Result result) {
        return switch (result) {
            case Success success -> success.value();
            case Failure failure -> failure.error();
        };
    }
}

sealed interface Result permits Success, Failure {}

record Success(String value) implements Result {}

record Failure(String error) implements Result {}
