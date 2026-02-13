package Part1;
// WAP to print the Fibonacci series up to n numbers

public class Fibonacci {
    
    public static int printFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return printFibonacci(n-1)+printFibonacci(n-2);
    }

    // Main Method
    public static void main(String[] args){
        int n = 10;
        // int result = printFibonacci(n);
        // System.out.println("Fibonacci  of " + n + " is : "+result);    
        for(int i=0;i<=n;i++){
            System.out.print(printFibonacci(i)+" ");
        }
    }
}