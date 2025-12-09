package Loops;
import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number :");
        int num=sc.nextInt();

        ////1st Way 
        // while(num>0){
        // int lastdigit=num%10;
        // System.out.print(lastdigit+"");
        // num=num/10;

        // }
        // System.out.println();

        ////Another Way
        int rev=0;
        while(num>0){
          
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse Number is : " +rev);

    }
}