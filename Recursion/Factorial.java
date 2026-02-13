// Find the Factorial of a Given Number.

public class Factorial {
    
    public static int fact(int n){
        if(n ==1 ||  n==0) return 1;

      //  int fact =1;
        return n*fact(n-1);
    }

    //Main fun
    public static void main(String[] args) {
        int n =5;
        int result = fact(n);
        System.out.println("factorial of a Number : " +result);
    }
}
