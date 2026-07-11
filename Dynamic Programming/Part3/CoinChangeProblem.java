// Coin Change Problem

import java.util.ArrayList;

public class CoinChangeProblem {

    // O(n)
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // initialize - sum is 0
        // i -> coins; j -> sum/change
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0;
        }

        // O(N*SUM)
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) { // valid
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];

                }

            }
        }
        return dp[n][sum];

    }

    public static void printWays(int coins[], int index, int sum, ArrayList<Integer> list) {

        if (sum == 0) {
            System.out.println(list);
            return;
        }

        if (index == coins.length || sum < 0) {
            return;
        }

        // Include current coin
        list.add(coins[index]);
        printWays(coins, index, sum - coins[index], list);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude current coin
        printWays(coins, index + 1, sum, list);
    }

    public static void main(String[] args) {
        int val[] = { 2, 5, 3, 6 };
        int sum = 10; // ans = 5

        System.out.println("Total Ways : " + coinChange(val, sum));

        System.out.println("All Ways :");
        printWays(val, 0, sum, new ArrayList<>());
    }
}
