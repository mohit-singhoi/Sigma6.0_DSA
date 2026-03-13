// This class is intended to analyze the performance of a power function implementation in Java.
public class PowerFun2 {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int halfPower = power(x, n/2);
        if(n%2!=0){ // if n is odd
            return x*halfPower*halfPower;
        }else{
            return halfPower*halfPower;
        }
    }

    // Main function
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + " raised to the power " + n + " is : " + power(x, n));
        // Time Complexity : O(log N) , Space Complexity : O(log N)
    }
    
}
