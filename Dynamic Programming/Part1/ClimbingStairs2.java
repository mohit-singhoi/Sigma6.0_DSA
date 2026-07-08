// Climbing Stairs Problem using DP -> Tabulation

import java.util.Arrays;

public class ClimbingStairs2 {

    public static int countWaysTab(int n){
        if(n <= 1) return 1;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        // tabulation loop
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("Total Ways : " +countWaysTab(n));

    }

}
