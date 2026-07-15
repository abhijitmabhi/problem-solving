package com.ama.remind;

public class BestTimeToBuyAndSellStockII122 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
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
