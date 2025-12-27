// Print Character Pattern
// A
// BC
// DEF
// GHIJ

package Basic_Patterns;

public class Pattern_04 {

    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        //Outer Loop
        for (int i = 1; i <= n; i++) {
            //Inner Loop
            for (int chars = 1; chars <= i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
