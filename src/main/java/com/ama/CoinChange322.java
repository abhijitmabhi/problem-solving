package com.ama;

public class CoinChange322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        int[] coinNeeded = new int[amount + 1];

        for (int i = 1; i < coinNeeded.length; i++) {
            coinNeeded[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && coinNeeded[i - coin] != Integer.MAX_VALUE) {
                    coinNeeded[i] = Math.min(1 + coinNeeded[i - coin], coinNeeded[i]);
                }
            }
        }

        return coinNeeded[amount] == Integer.MAX_VALUE ? -1 : coinNeeded[amount];
    }

}
