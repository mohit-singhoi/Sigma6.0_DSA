// You are given an array prices where prices[i] is the price of a given stock on the ith day. 
// you want to maximize your profit by choosing a single day to byu one stock and choosing a different day in the furure to sell the stock. 
// Return the maximum profit you can achieve from this transaction . if youcannot achieve any profit , return 0.

package Array_Part2;

public class Stocks {
    public static int  buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice <prices[i]){ // Profit occur
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit); // today's profit
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;


    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; // Complexity is O(n)
        int result = buyAndSellStocks(prices);

        System.out.println("Max Profit is : " +result);
    }

}
