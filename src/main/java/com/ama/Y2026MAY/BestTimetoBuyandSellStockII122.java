package com.ama.Y2026MAY;

public class BestTimetoBuyandSellStockII122 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price > buyingPrice) {
                maxProfit += (price - buyingPrice);
            }
            buyingPrice = price;
        }

        return maxProfit;
    }
}
