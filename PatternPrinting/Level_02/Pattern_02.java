//WAP to print this pattern

//     * 
//    ** 
//   ***
//  ****
// *****

package PatternPrinting.Level_02;
import java.util.Scanner;

public class Pattern_02 {

    public static void rightHalfPyramid(int n){
        for (int i = 1; i <= n; i++) {

            // spaces (decrease)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars (increase)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        rightHalfPyramid(range);
    }
}
