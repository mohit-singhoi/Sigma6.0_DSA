// Simple Star Pattern 

package PatternPrinting.Level_01;
import java.util.Scanner;
public class SquareStar {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        System.out.print("Enter any number :");
        int num = sc .nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
    
}
