package PracticeSets;

public class Qns_01 {
    public static int printOptimizedSq(int x , int n){ // O(log n)
        if(n == 0){
            return 1;
        }
       // int halfPowerSq = printOptimizedSq(x,n/2) * printOptimizedSq(x, n/2);

       int halfPower = printOptimizedSq(x, n/2);
       int halfPowerSq = halfPower * halfPower;

        //  If n is odd
        if(n % 2!=0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    //Main Fun
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int result = printOptimizedSq(x, n);
        System.out.println("Power of " + x + " ^ " + n + " = " +result);
    }
}
