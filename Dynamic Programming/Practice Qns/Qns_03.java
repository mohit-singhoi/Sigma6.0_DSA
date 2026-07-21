// Qns_03 : MAximum profit after buying and selling stocks with transaction fees.
// We have an array of positive integers containing the price of stocks  and transaction fees, the task is to find the maximum profit abd the difference of days on which you are getting the maximum profit.

// Input : arr[] = {6,1,7,2,8,4} transactionFee = 2
// output : 8, 1

// Input : arr[] = {7,1,5,3,6,4} transactionFee = 1
// Output : 5,1

// using tabulation
public class Qns_03 {

    public static int maxProfit(int prices[], int fee) {

        int n = prices.length;

        int dp[][] = new int[n + 1][2];

        dp[n][0] = dp[n][1] = 0;

        for (int i = n - 1; i >= 0; i--) {

            // Buy State
            dp[i][1] = Math.max(
                    -prices[i] + dp[i + 1][0],
                    dp[i + 1][1]);

            // Sell State
            dp[i][0] = Math.max(
                    prices[i] - fee + dp[i + 1][1],
                    dp[i + 1][0]);
        }

        return dp[0][1];
    }

    public static void main(String[] args) {

        int prices[] = {6, 1, 7, 2, 8, 4};
        int fee = 2;

        System.out.println("Maximum Profit = " + maxProfit(prices, fee));
    }
}
