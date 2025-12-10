package Loops.PracticeQns;
import java.util.Scanner;
public class Qns_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        double fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " + num +" is :"+fact);


    }
    
}
