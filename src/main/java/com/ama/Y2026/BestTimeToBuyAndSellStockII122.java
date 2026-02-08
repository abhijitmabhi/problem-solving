package com.ama.Y2026;

public class BestTimeToBuyAndSellStockII122 {
    public static void main() {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price > buyingPrice) {
                maxProfit += (price - buyingPrice);
            }
            buyingPrice = price;
        }

        return maxProfit;
    }
}
