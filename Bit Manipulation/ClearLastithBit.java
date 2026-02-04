public class ClearLastithBit {
    public static int clearLastIthBit(int n, int i) {
        // int BitMask = (~0 << i);
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static void main(String[] args) {
        int n = 15; // Example number
        int i = 2; // Clear last i bits
        System.out.println("Number after clearing last " + i + " bits is: " + clearLastIthBit(n, i));
    }
}