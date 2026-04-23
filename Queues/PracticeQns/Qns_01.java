// Qns 1: generate Binary Numbers
// Given a number N, generate all binary numbers with decimal values from 1 to N.

package PracticeQns;
import java.util.Scanner;
public class Qns_01 {

    public static void generateBinaryNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String binaryString = Integer.toBinaryString(i);
            System.out.println(binaryString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        generateBinaryNumbers(N);
    }
}
