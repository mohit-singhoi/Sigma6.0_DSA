public class PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 9; // Example number
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n));
    }
}