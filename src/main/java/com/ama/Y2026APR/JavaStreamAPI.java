package com.ama.Y2026APR;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamAPI {
    public static void main(String[] args) {
        // Find distinct elements in a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 5);
        List<Integer> distinctList = list.stream()
                .distinct()
                .toList();

        System.out.println(distinctList);

        // Using Collectors -> without using distinct()
        List<Integer> distinctList2 = list.stream()
                .collect(Collectors.toMap(Function.identity(), v -> v, (v1, v2) -> v1))
                .values()
                .stream()
                .toList();

        // Find duplicates in a list
        Set<Integer> distinctSet = new HashSet<>();

        List<Integer> duplicateList = list.stream()
                .filter(x -> !distinctSet.add(x))
                .toList();

        duplicateList.forEach(System.out::println);

        // Add even numbers
        int addEvenNumbers = list.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);

        // sort in descending order
        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();


    }
}
