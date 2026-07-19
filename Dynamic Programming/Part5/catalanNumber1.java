// Catalan's number Problem using memoization

//C0 = 1
//C1 = 1

//C2 = C0.C1 + C1.C2 = 2
//C3 = C0.C2 + C1.C2 + C2.C0 = 5
//C4 = 

import java.util.*;
public class CatalanNumber1 {
    public static int catalanMem(int n, int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans = 0;
        for(int i =0;i<n;i++){
            ans += catalanMem(i, dp) * catalanMem(n-i-1, dp);
        }

        return dp[n] = ans;
    }

    public static void main(String [] args){
        int n = 4;
        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);
        System.out.println("Catalan of " + n + " is : " + catalanMem(n, dp));
    }
    
}
