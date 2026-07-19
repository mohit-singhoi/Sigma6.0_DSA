// Catalan's number Problem using memoization

//C0 = 1
//C1 = 1

//C2 = C0.C1 + C1.C2 = 2
//C3 = C0.C2 + C1.C2 + C2.C0 = 5
//C4 = 

import java.util.*;

public class CatalanNumber2 {
    //O(n^2)
    public static int catalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i =2;i<=n;i++){
            for(int j =0;j<i;j++){
                dp[i] += dp[j] * dp[i-j-1]; // Ci = Cj * Ci-j-1

            }
        }

        return dp[n];

    }

        public static void main(String [] args){
        int n = 5;
        System.out.println("Catalan of " + n + " is : " + catalanTab(n));
    }

    
}
