import java.util.Scanner;

public class Fibonacci1 {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        n = sc.nextInt();

        System.out.println("Fibonacci of : " + n + " is : " +fib(n));



    }
    
}
