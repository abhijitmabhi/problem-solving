package com.ama.Y2026JUNE;

import java.util.List;
import java.util.Optional;

public class JAVAStream {
    public static void main(String[] args) {
        List<String> names = List.of("Alex", "Bob", "Charlie", "Dorin");
        List<String> numbers = List.of("10", "25", "3", "47", "8");
        List<String> words = List.of("java", "stream", "lambda", "generics");
        StringBuilder strBdr = new StringBuilder();

        List<String> empNames = List.of("Alice", "Bob", "Charlie");
        List<String> data = List.of("30", "Alice", "25", "Bob", "40", "Charlie", "abc");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Integer sum = numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);

        String result = String.join(" | ", words);

        System.out.println(result);

        empNames.stream()
                .map(Employee::new)
                .forEach(System.out::println);

        data.stream()
                .map(JAVAStream::toInt)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(x -> x > 25)
                .forEach(System.out::println);


    }

    // Helper — already written for you
    static Optional<Integer> toInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + name + "}";
    }
}
