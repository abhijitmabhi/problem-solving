package com.ama;

public class CoinChange322 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

    public static int coinChange(int[] coins, int amount) {
//        Arrays.sort(coins);
//        int count = 0;
//
//        for (int i = coins.length - 1; i >= 0; i--) {
//            if(coins[i] <= amount){
//                int possibility = amount / coins[i];
//                count += possibility;
//
//                amount = amount - (coins[i] * possibility);
//            }
//        }
//
//        if(amount != 0)
//            return -1;
//
//        return count;
        if (amount < 1) {
            return 0;
        }

        int[] coinsNeeded = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            coinsNeeded[i] = Integer.MAX_VALUE;

            for (int coin : coins) {
                if (coin <= i && coinsNeeded[i - coin] != Integer.MAX_VALUE) {
                    coinsNeeded[i] = Math.min(coinsNeeded[i], 1 + coinsNeeded[i - coin]);
                }
            }
        }

        return coinsNeeded[amount] == Integer.MAX_VALUE ? -1 : coinsNeeded[amount];
    }

}
