package com.ama.remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    // Time: O(n log n)
    // Space: O(n)
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] newIntervals = intervals[0];
        result.add(newIntervals);


        for (int[] interval : intervals) {
            if (interval[0] <= newIntervals[1]) {
                newIntervals[1] = Math.max(newIntervals[1], interval[1]);
            } else {
                newIntervals = interval;
                result.add(newIntervals);
            }
        }

        return result.toArray(int[][]::new);
    }
}
