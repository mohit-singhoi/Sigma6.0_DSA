// Qns_01 : Tribonacci Numbers using recursion
// The Tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the tree preceding terms.
// a(n) = a(n-1) + a(n-2) + a(n-3) with a(0) = a(1) = 0 , a(2) = 1

// Input = 5
// Output = 0, 0, 1, 1, 2

// Input : 10
// Output : 0,0,1,1,2,4,7,13,24,44

import java.util.Scanner;

public class Qns_01_1 {
    public static int tribonacci(int n){
        if(n == 0 || n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }

        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++){
            System.out.print(tribonacci(i)+" ");
        }

    }
    
}
