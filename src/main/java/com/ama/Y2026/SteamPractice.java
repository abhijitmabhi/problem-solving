package com.ama.Y2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamPractice {
    public static void main(String[] args) {
        doStream();
    }

    public static void doStream() {
        List<Integer> list = Arrays.asList(1, 13, 2, 6, 5, 8, 10, 20, 12);

        // Max Element
        var maxElement = list.stream().max(Integer::compareTo).get();

        // Sum of All Elements
        int sumOfAllElements = list.stream().mapToInt(Integer::intValue).sum();

        // Average
        var average = list.stream().mapToInt(Integer::intValue).average();

        // sorting: ascending
        var sortingAscending = list.stream().sorted().toList();

        // sorting: descending
        var sortingDescending = list.stream().sorted(Comparator.reverseOrder()).toList();

        List<String> companies = Arrays.asList("google", "netflix", "nvidia", "", "amazon", "microsoft");

        // count string starts with 'N'
        var countStringsStartWithN =
                companies.stream().filter(s -> s.toUpperCase().startsWith("N")).count();

        // join Strings (, separated)
        var joinStrings = companies.stream().collect(Collectors.joining(", "));

        // all positive
        var allPositive = list.stream().allMatch(x -> x > 0);

        // any num divisible by 3
        var numDivisibleBy3 = list.stream().anyMatch(x -> x % 3 == 0);

        // flatMap
        List<String> sList = List.of("Java", "Stream");

        var flatMap = sList.stream().flatMap(s -> Arrays.stream(s.split(""))).toList();

        // reduce
        List<Integer> listReduce = List.of(1, 2, 4);

        int result = listReduce.stream().reduce(10, Integer::sum);

        System.out.println(result);
    }
}
