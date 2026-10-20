package com.ama.sap2026;

public class CoinChange322 {
    public static void main(String[] args) {
        System.out.println(noOfCoins(new int[]{1, 2, 5}, 11));
    }

    private static int noOfCoins(int[] coins, int amount) {
        int[] coinArr = new int[amount + 1];

        for (int i = 1; i < coinArr.length; i++) {
            int minCoin = Integer.MAX_VALUE;

            for (int coin : coins) {
                if ((i - coin) >= 0 && coinArr[i - coin] != Integer.MAX_VALUE) {
                    minCoin = Math.min(minCoin, 1 + coinArr[(i - coin)]);
                }
            }

            coinArr[i] = minCoin;
        }

        return coinArr[amount] == Integer.MAX_VALUE ? -1 : coinArr[amount];
    }
}
