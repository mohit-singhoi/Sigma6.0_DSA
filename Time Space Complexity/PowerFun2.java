// This class is intended to analyze the performance of a power function implementation in Java.
public class PowerFun2 {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int halfPowersq = power(x, n/2) * power(x, n/2); // recursive call to calculate half power
        if(n%2!=0){ // if n is odd
            return x*halfPowersq;
        }else{
            return halfPowersq;
        }
    }

    // Main function
    public static void main(String[] args) { // TC = O(n) and SC = O(n) due to recursive calls
        int x = 2;
        int n = 5;
        System.out.println(x + " raised to the power " + n + " is : " + power(x, n));
        
    }
    
}
