// O - 1 Knapsack Problem using Tabulation

public class ZeroOneKnapsack2 {

    public static int knapsack(int )

        public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
            
        }

        System.out.println("Max Profit : " + kanpsack(val, wt, W, val.length,dp));

    }
    
}
