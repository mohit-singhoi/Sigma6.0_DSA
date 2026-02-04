public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        // Create a mask to clear bits from position i to j (inclusive)
        int a = (~0) << (j + 1); // Bits after j are 1, bits from 0 to j are 0
        int b = (1 << i) - 1;    // Bits from 0
        int bitMask = a | b;
        return n & bitMask;
        // int mask = ((1 << (j + 1)) - 1) & (~((1 << i) - 1));
        // return n & mask;
    }

    public static void main(String[] args) {
        int n = 10; // Example number
        int i = 2;  // Start bit position
        int j = 4;  // End bit position
        System.out.println("Number after clearing bits from " + i + " to " + j + " is: " + clearRangeOfBits(n, i, j));
    }
}