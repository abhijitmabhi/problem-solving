package com.ama;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStockII122 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        List<Integer> maxProfitList = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyingPrice) {
                buyingPrice = prices[i];
            } else {
                maxProfitList.add((prices[i] - buyingPrice));
                buyingPrice = prices[i];
            }
        }

        return maxProfitList.stream().mapToInt(Integer::intValue).sum();

    }
}
