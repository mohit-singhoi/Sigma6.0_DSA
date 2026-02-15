// WAP to print power in an Optimized way in O(logn) time complexity

public class PrintPower1 {
    public static int optimizedPower(int a , int n){
        if(n == 0){
            return 1;

        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        // N is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    //Main fun
    public static void main(String[] args) {
        int n =10;
        int a = 2;
        int result = optimizedPower(a, n);
        System.out.println("Power of " + a+"^"+n + " = " + result);
    }
    
}
