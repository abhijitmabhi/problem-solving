package com.ama.remind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KClosestPointsToOrigin973 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2)));
    }

    // Time: O(k log k)
    // Space: O(n)
    public static int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][];

        List<DRecord> distance = new ArrayList<>();

        for (int[] p : points) {
            double d = Math.pow(p[0], 2) + Math.pow(p[1], 2);

            distance.add(new DRecord(d, p));
        }

        for (int i = 0; i < k; i++) {
            result[i] = distance.get(i).point;
        }

        return result;
    }

    record DRecord(Double distance, int[] point) {

    }
}
