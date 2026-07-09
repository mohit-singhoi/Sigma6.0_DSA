// 0 - 1 Kanpsack problem using DP(Memoization)
// Val[] = 15, 14, 10, 45, 30
// wt[] = 2, 5, 1, 3, 4
// W(total allowed weight) = 7
// ans = max Profit
public class Zeroknapsack1 {
    // O(n * W)
        public static int kanpsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + kanpsack(val, wt, W - wt[n - 1], n - 1,dp);
            // exclude
            int ans2 = kanpsack(val, wt, W, n - 1,dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        } else{ // not valid
            dp[n][W] =  kanpsack(val, wt, W, n-1,dp);
            return dp[n][W];

        }
    }



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
