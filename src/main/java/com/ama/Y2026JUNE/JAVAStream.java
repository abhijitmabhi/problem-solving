package com.ama.Y2026JUNE;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class JAVAStream {
    public static void main(String[] args) {
        List<String> names = List.of("Alex", "Bob", "Charlie", "Dorin");
        List<String> numbers = List.of("10", "25", "3", "47", "8");
        List<String> words = List.of("java", "stream", "lambda", "generics");
        StringBuilder strBdr = new StringBuilder();

        List<String> empNames = List.of("Alice", "Bob", "Charlie");
        List<String> data = List.of("30", "Alice", "25", "Bob", "40", "Charlie", "abc");

        List<List<String>> departments = List.of(
                List.of("Alice", "Bob"),
                List.of("Charlie", "David"),
                List.of("Eve")
        );

        List<String> sentences = List.of(
                "Java is great",
                "Stream is powerful",
                "FlatMap is useful"
        );

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

        departments.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("----------------------------");
        sentences.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Map<Integer, String> employees = Map.of(
                1, "Alice",
                2, "Bob",
                3, "Charlie"
        );

        List<Integer> ids = List.of(1, 5, 3, 8, 2);

        ids.stream()
                .map(employees::get)
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        System.out.println("----------------------------");
        List<String> namesCh = List.of("Alice", "  ", "Bob", "", "Charlie", "  ");
        namesCh.stream()
                .filter(s -> !s.isBlank())
                .map(String::trim)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("_______________________________");
        List<String> data2 = List.of(
                "Alice:Engineering:85000",
                "Bob:Marketing:INVALID",
                "Charlie:Engineering:92000",
                "David:Marketing:78000",
                "Eve:Engineering:INVALID"
        );

        data2.stream()
                .map(s -> s.split(":"))
                .map(JAVAStream::parseEmployee)
                .flatMap(Optional::stream)
                .collect(groupingBy(Employee2::department))
                .forEach((k, v) -> System.out.println(k + ": " + v.stream().mapToInt(Employee2::salary).average().orElse(0)));


    }

    // Helper - Convert a string to an integer
    static Optional<Integer> toInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    // Helper - Split a sentence into words
    static Stream<String> splitIt(String s) {
        return Stream.of(s.split(" "));
    }

    static Optional<Employee2> parseEmployee(String[] parts) {
        try {
            int salary = Integer.parseInt(parts[2]);
            return Optional.of(new Employee2(parts[0], parts[1], salary));
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

record Employee2(String name, String department, int salary) {
}
