public class UpdateithBit {
    public static void updateIthBit(int n, int i, int newBit){
        // Clear the ith bit
        int BitMask = ~(1 << i);
        int clearedN = n & BitMask;

        // Set the ith bit to newBit
        int newBitShifted = (newBit << i);
        int updatedN = clearedN | newBitShifted;

        System.out.println("Number after updating the " + i + "th bit to " + newBit + " is: " + updatedN);
    }
    public static void main(String[] args) {
        int n = 10; // Example number
        int i = 2;  // Bit position to update
        int newBit = 1; // New bit value (0 or 1)
        updateIthBit(n, i, newBit);
    }
    
}
