package com.ama;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class MyJavaDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, -5, -24, 50);

        System.out.println(myList.reversed());

        IntPredicate positive = x -> x > 0;
        IntPredicate negative = x -> x < 0;
        IntUnaryOperator doubled = x -> x * 2;

        System.out.println(myList.stream().filter(x -> x > 0).collect(Collectors.toList()));
        System.out.println(myList.stream().filter(x -> negative.test(x)).collect(Collectors.toList()));
        System.out.println(myList.stream().map(doubled::applyAsInt).collect(Collectors.toList()));

        System.out.println(myList.stream().mapToInt(operation("+")::applyAsInt).sum());

        Function<String, String> uppercase = String::toUpperCase;
        System.out.println(uppercase.apply("abhijit"));

        String myString = "Deutschland";
        System.out.println(myString != null ? myString.toUpperCase() : "null");

        System.out.println(operate(5, 6, (x, y) -> x * y));
        System.out.println(operate(5, 6, (x, y) -> x + y));
    }

    public static IntUnaryOperator operation(String opt) {
        return switch (opt) {
            case "+" -> x -> x + 1;
            case "-" -> x -> x - 1;
            default -> x -> x;
        };
    }

    public static int operate(int a, int b, IntBinaryOperator operation) {
        return operation.applyAsInt(a, b);
    }
}
