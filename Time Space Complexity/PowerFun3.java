// Optimized implementation of power function using recursion
public class PowerFun3 {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int halfPower = power(x, n/2); // recursive call to calculate half power
        if(n%2!=0){ // if n is odd
            return x*halfPower*halfPower;
        }else{
            return halfPower*halfPower;
        }
    }

    // Main function
    public static void main(String[] args) { // TC = O(log N) and SC = O(log N) due to recursive calls
        int x = 2;
        int n = 5;
        System.out.println(x + " raised to the power " + n + " is : " + power(x, n));
        
    }
    
}
