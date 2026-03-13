// Power function implementation in Java and its analysis of time complexity.
public class PowerFun1 {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    // Main function
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + " raised to the power " + n + " is : " + power(x, n));
        // Time Complexity : O(N) , Space Complexity : O(N)
    }
    
}
