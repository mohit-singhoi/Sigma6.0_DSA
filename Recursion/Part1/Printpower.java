// WAP to print X^n using recursion
// Example: 2^10 = 1024

public class Printpower {

    public static int printPowerOfN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // //1.
        // int xnm1 = printPowerOfN(x, n - 1);
        // int xn = x * xnm1;
        // return xn;


        ////2. 
        return x * printPowerOfN(x, n-1);
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        int result = printPowerOfN(x, n);
        System.out.println("Power of X^n : " + result);
    }
}
