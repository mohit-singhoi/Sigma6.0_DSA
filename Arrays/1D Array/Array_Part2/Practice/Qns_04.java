package Array_Part2.Practice;

public class Qns_04 {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice <prices[i]){
                //Profit gain
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] ={7,1,5,3,6,4};
        int result = buyAndSellStocks(price);
        System.out.println("Max Profit is : " + result);
    }
    
}
