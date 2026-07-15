// Road Cutting Problem 
// Given a rod of length n inch and an array of prices that includes prices of all prices of size smalleer than n. 
// Determine the maximum value obtainable by cutting up the rod and selling the prices.

// length =  1, 2, 3, 4, 5, 6, 7, 8
// price = 1, 5, 8, 9, 10, 17, 17, 20
// rodLength = 8
public class RoadCutting {

    // print dp table
    public static void printDP(int dp[][]) {
        System.out.println("\nDP Table:");

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Weight => length; Val => price; W => totRod
    public static int rodCutting(int length[], int price[], int totRod) {
        int n = price.length;
        int dp[][] = new int[n + 1][totRod + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < totRod + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= totRod; j++) {

                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]],dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        printDP(dp); // Print DP table
        return dp[n][totRod]; // Return maximum profit
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // pieces length
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int totRod = 8;
        System.out.println("Max Profit : " + rodCutting(length, price, totRod));
    }

}
