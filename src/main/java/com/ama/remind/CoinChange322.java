package com.ama.remind;

public class CoinChange322 {
    // Time Complexity: O(m*n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(numOfCoin(new int[]{2}, 3));
    }

    public static int numOfCoin(int[] coins, int amount) {
        int[] coinStore = new int[amount + 1];

        for (int i = 1; i < coinStore.length; i++) {
            int minCoin = Integer.MAX_VALUE;

            for (int coin : coins) {
                if ((i - coin) > -1 && coinStore[i - coin] != Integer.MAX_VALUE) {
                    minCoin = Math.min(minCoin, 1 + (coinStore[i - coin]));
                }
            }

            coinStore[i] = minCoin;
        }

        return coinStore[amount] == Integer.MAX_VALUE ? -1 : coinStore[amount];
    }
}
