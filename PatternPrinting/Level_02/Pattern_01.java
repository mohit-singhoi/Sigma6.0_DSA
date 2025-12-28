//Print the Hollow Recatangle
// * * * * * 
// *       *
// *       * 
// * * * * * 


package patternprinting.level_02;
import java.util.Scanner;


public class Pattern_01 {
    public static void hollowRectangle(int a, int b){
        for(int i=1;i<=a;i++){
            {
                for(int j=1;j<=b;j++){
                    if(i==1 || j==1 || i==a || j==b){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row & column Size :");
        int row=sc.nextInt();
        int col = sc.nextInt();
        hollowRectangle(row, col);
    }
    
}
