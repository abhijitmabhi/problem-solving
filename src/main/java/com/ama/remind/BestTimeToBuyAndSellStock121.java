package com.ama.remind;

public class BestTimeToBuyAndSellStock121 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,8}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price > buyingPrice) {
                maxProfit = Math.max(maxProfit, price - buyingPrice);
            } else {
                buyingPrice = price;
            }
        }

        return maxProfit;
    }
}
