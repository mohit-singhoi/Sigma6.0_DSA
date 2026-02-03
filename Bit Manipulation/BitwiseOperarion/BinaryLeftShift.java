package BitwiseOperarion;
public class BinaryLeftShift {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int shiftBy = 2;
        int result = a << shiftBy; // Binary Left Shift operation

        System.out.println("The result of left shifting " + a + " by " + shiftBy + " positions is: " + result);
    }
    
}
