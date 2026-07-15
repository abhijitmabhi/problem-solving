package com.ama.spade;

public class BestTimeToBuyAndSellStock {
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    // 1. Buy at when the price is lower than the current buying price
    // 2. Sell at when the price is higher than the current buying price && store the max profit
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < buyingPrice) {
                buyingPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - buyingPrice);
            }
        }

        return maxProfit;
    }
}
