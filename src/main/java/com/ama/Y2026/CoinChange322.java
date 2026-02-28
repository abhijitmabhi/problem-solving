package com.ama.Y2026;

public class CoinChange322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {2}, 3));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] coinStore = new int[amount + 1];

        for (int i = 1; i < coinStore.length; i++) {
            int minCoin = Integer.MAX_VALUE;

            for (int c : coins) {
                if (c <= i && coinStore[i - c] != Integer.MAX_VALUE) {
                    minCoin = Math.min(minCoin, 1 + coinStore[i - c]);
                }
            }

            coinStore[i] = minCoin;
        }

        return coinStore[amount] == Integer.MAX_VALUE ? -1 : coinStore[amount];
    }
}
