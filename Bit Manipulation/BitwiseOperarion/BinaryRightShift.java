package BitwiseOperarion;
public class BinaryRightShift {
    public static void main(String[] args) {
        int a = 6;  // Binary: 000110
        int shiftBy = 2;
        int result = a >> shiftBy; // Binary Right Shift operation

        System.out.println("The result of right shifting " + a + " by " + shiftBy + " positions is: " + result);
    }
    
}
