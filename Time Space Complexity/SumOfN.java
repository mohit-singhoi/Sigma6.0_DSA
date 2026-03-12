// WAP to Calculate the sum of n number using recursion
public class SumOfN {
    public static int Sum(int n){
        if(n== 0){
            return 0;
        }
        return n+Sum(n-1);
    }

    // Main
    public static void main(String[] args) { // TC : o(N)  , SC : o(N)
        int n= 5;
        System.out.println("Sum of N Numbers : " +Sum(n));
    }
    
}
