public class SetithBit {
    public static void setIthBit(int n, int i){
        int BitMask = 1;
        int result = n | (BitMask << i);
        System.out.println("Number after setting the " + i + "th bit: " + result);
    }
    public static void main(String[] args) {
        int n = 10; // Example number
        int i = 1;  // Bit position to set
        setIthBit(n, i);
    }
    
}
