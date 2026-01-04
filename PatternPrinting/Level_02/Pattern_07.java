//WAP to print Solid RHOMBUS

//         * * * * * 
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * * 

package PatternPrinting.Level_02;

public class Pattern_07 {
    public static void solidRhombus(int n) {

        // 1st half
        for (int i = 1; i <= n; i++) {

            // spaces :(n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        solidRhombus(n);
    }

}
