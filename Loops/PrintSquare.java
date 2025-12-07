package Loops;
import java.util.Scanner;
public class PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N to print square pattern of N*N:");
        int n=sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int line =1;
        while(line<=n){
            System.out.println("****");
            line++;
        }
    }
    
}
