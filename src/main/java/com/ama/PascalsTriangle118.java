package com.ama;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);

        List<Integer> prevRow = row;

        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            curRow.add(1);
            prevRow = curRow;

            result.add(curRow);
        }

        return result;
    }
}
