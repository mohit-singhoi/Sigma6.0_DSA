public class FastExpon {
    public static int fastExponentiation(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) { // If exponent is odd
                result *= base;
            }
            base *= base; // Square the base
            exponent >>= 1; // Divide exponent by 2
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 5; // Example base
        int exponent = 3; // Example exponent
        System.out.println(base + " raised to the power of " + exponent + " is: " + fastExponentiation(base, exponent));
    }
    
}
