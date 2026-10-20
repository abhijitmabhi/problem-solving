package com.ama.sap2026;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < buyingPrice) {
                buyingPrice = price;
            }

            maxProfit = Math.max(maxProfit, price - buyingPrice);
        }

        return maxProfit;
    }
}
