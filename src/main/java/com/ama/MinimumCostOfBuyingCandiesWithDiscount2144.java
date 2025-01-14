package com.ama;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount2144 {
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{6, 5, 7, 9, 2, 2}));
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0;
        int freeCount = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (freeCount == 2) {
                freeCount = 0;
            } else {
                minCost += cost[i];
                freeCount++;
            }
        }

        return minCost;
    }

}
