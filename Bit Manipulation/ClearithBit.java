public class ClearithBit {
    public static void clearIthBit(int n, int i){
        int BitMask = ~(1 << i);
        int result = n & BitMask;
        System.out.println("Number after clearing the " + i + "th bit: " + result);
    }
    public static void main(String[] args) {
        int n = 10; // Example number
        int i = 1;  // Bit position to clear
        clearIthBit(n, i);
    }
    
}
