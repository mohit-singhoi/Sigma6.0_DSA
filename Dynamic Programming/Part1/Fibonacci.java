public class Fibonacci {

    public static int  fib(int n){ // 0 1 1 2 3
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) +fib(n-2);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fib(n));

    }
}