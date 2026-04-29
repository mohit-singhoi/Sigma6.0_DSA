// Qns_04.java
// Best Time to Buy and Sell Stock
// Given an array prices[] of length N, where each element represents the price of a stock on a particular day, the task is to determine the maximum profit that can be earned by performing at most one buy and one sell transaction. A stock must be bought before it can be sold. If no profit can be made, return 0. The goal is to find the best day to buy the stock and the best later day to sell it so that the profit is maximized.

// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: The maximum profit can be achieved by buying the stock on day 2 (price = 1) and selling it on day 5 (price = 6), which gives a profit of 6 - 1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:
// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transaction is done, and the max profit = 0.
public class Qns_04 {
    public static int maxProfit(int[] prices , int n){   
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    // Main Fun
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;
        int ans = maxProfit(prices, n);
        System.out.println("Maximum profit that can be earned : " + ans);
    }
    
}
