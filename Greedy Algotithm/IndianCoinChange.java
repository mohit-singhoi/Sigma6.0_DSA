// WAP to find the minimum number of coins that make a change for a given amount of money, if we have an infinite supply of each of the denominations of coins.

import java.util.*;

public class IndianCoinChange {
    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int amount = 43;

        int originalAmount = amount;

        List<Integer> result = new ArrayList<>();
        int countOfCoins = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
                countOfCoins++;
            }
        }

        System.out.println("Amount: " + originalAmount);
        System.out.println("Coins used: " + result);
        System.out.println("Minimum number of coins used: " + countOfCoins);
    }
}