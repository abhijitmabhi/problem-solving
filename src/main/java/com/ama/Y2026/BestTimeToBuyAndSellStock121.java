package com.ama.Y2026;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - buyPrice);
            }
        }

        return maxProfit;
    }
}
