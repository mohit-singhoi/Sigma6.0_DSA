// WAP to find the sum of first n natrural Num.

public class NaturalSum {
    
    public static int naturalSum(int n){
       
        if(n==1) return 1;
        return n+naturalSum(n-1);
    }

    public static void main(String[] args) {
        int n =10;
        int result = naturalSum(n);
        System.out.println("Sum of " + n + "natural Number : " +result);
    }
}
