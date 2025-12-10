package Loops.PracticeQns;
import java.util.Scanner;
public class Qns_04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :");
        int num = sc.nextInt();
        System.out.println();

        int table =0;
        for(int i=1;i<=10;i++){
           table = num*i;
           System.out.println(table);
        }
    }
    
}
