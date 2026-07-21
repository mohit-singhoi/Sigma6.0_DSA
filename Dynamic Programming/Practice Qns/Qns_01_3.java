// Qns_01_2 : Tribonacci Numbers using tabulation
// The Tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the tree preceding terms.

// Input = 5
// Output = 0, 0, 1, 1, 2

// Input : 10
// Output : 0,0,1,1,2,4,7,13,24,44


import java.util.*;

public class Qns_01_3 {
    //O(n)
    public static int tribonacciTab(int n , int dp[]){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        for (int i = 0; i < n; i++) {
            System.out.print(tribonacciMem(i, dp) + " ");
        }

    }

}
