// Add 1 to an integer using Bit manipulation
// Hint : Try using Bitwise NOT  

public class Qns_03 {
    public static void main(String[] args) {
        int x = 7; // 0111
        int result = -(~x); // -(-1000) => -(-8) => 8
        System.out.println(x + " + " + 1 + " is : " + result);
    }
    
}
