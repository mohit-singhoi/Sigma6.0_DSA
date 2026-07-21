// Qns_01_2 : Tribonacci Numbers using tabulation
// The Tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the tree preceding terms.

// Input = 5
// Output = 0, 0, 1, 1, 2

// Input : 10
// Output : 0,0,1,1,2,4,7,13,24,44


import java.util.*;

public class Qns_01_3 {
    //O(n)
    public static void tribonacciTab(int n){
        if( n == 0) return ;

        int dp[] = new int[n];

        dp[0] = 0;
        if(n > 1){
            dp[1] = 0;
        }

        if(n > 2){
            dp[2] = 1;
        }

        for(int i = 3;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for(int i = 0;i<n;i++){
            System.out.print(dp[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        System.out.print("Tribonacci Series : ");
        tribonacciTab(n);


    }

}
