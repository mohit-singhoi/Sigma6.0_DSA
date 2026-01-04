//WAP to print this pattern

// * 
// ** 
// *** 
// **** 
// ***** 

package PatternPrinting.Level_01;

public class Pattern_01 {
    public static void main(String[] args) {
        for(int line =1;line<=5;line++){
            for(int star =1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
