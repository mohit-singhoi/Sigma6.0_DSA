public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {

            if((n & 1) != 0){ // Check if the least significant bit is set
                count++;
            }
            n = n >> 1;
            // count += (n & 1); // Increment count if the least significant bit is set
            // n >>= 1; // Right shift to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10; // Example number
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n));
    }
    
}
