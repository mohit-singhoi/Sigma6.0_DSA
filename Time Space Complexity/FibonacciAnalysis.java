// Fibonacci  Time , Space complexity Analysis 
import java.util.Scanner;
public class FibonacciAnalysis {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    // Main fun
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N :");
        n= sc.nextInt();
        System.out.println("Fibonacci Series ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i) + " ");
        }
        System.out.println("\nFibonacci of " + n + " is : " + fib(n));
        // Time Complexity : O(2^N)  , Space Complexity : O(N)

        sc.close();
    }
}
