package com.ama;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = 0;
        for (int i=0; i < prices.length; i++){
            for (int j = i+1; j < prices.length; j++) {
                if(prices[i] > prices[j])
                {
                    continue;
                }
                minPrice = Math.max(prices[j] - prices[i], minPrice);
            }
        }

        return minPrice;
    }

}
