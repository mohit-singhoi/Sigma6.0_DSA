//WAP to print Butterfly Pattern
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

package PatternPrinting.Level_02;

import java.util.Scanner;

public class Pattern_06 {
    public static void butterfly(int n) {
        // 1st half

        //stars -i
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }

            //spaces -2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
 
            }

            //stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }

        

        ////2nd Half
        
        //stars -(n-i)
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }

            //spaces -i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" "+" ");
 
            }

            //stars -(n-i)
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n=sc.nextInt();
        System.out.println();
        butterfly(n);
    }
}
