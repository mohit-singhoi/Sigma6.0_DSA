package Loops;
import java.util.Scanner;
public class Multiple10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter Number");
            int num= sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Number was :"+n);
        } while (true);
    }
    
}
