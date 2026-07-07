// Fibonacci using DP(Dynamic Programming Tabulation)

import java.util.Scanner;

public class Fibonacci2 {

    public static int fibTabulation(int n){
        int dp[] =  new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
        }

        return dp[n]; //ans
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is : " +fibTabulation(n));
    }
    
}
