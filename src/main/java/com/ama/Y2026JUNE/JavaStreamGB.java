package com.ama.Y2026JUNE;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class JavaStreamGB {
    public static void main(String[] args) {
        record Employee(String name, String department, int salary) {
        }

        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 85000),
                new Employee("Bob", "Marketing", 72000),
                new Employee("Charlie", "Engineering", 92000),
                new Employee("David", "Marketing", 78000),
                new Employee("Eve", "HR", 65000)
        );

        employees.stream()
                .collect(groupingBy(Employee::department, mapping(Employee::name, toList())))
                .forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("_______________________________");

        employees.stream()
                .collect(groupingBy(Employee::department, counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("_______________________________");

        employees.stream()
                .collect(groupingBy(Employee::department, averagingDouble(Employee::salary)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach((e) -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
