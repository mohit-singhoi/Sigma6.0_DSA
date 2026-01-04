//Inverted & Rotated Half-Pyramid Pattern

//   *  
//  **
// ***
//**** 


package PatternPrinting.Level_01;

public class Pattern_07 {
    public static void main(String[] args) {
        int row =4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }

            //Print Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
