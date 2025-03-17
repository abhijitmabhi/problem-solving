package com.ama;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }

    public static int calPoints(String[] operations) {
        List<Integer> result = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "C" -> result.removeLast();
                case "D" -> result.add(result.getLast() * 2);
                case "+" -> result.add((result.getLast()) + (result.get(result.size() - 2)));
                default -> result.add(Integer.parseInt(operation));
            }
        }

        return result.stream().mapToInt(Integer::intValue).sum();
    }
}
