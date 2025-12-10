package Loops.PracticeQns;
import java.util.Scanner;
public class Qns_02{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int evensum=0;
        int oddsum=0;
        int integers;
        int choice;

        do{
        System.out.print("Enter the Integer  ");
        integers =sc.nextInt();
        if(integers%2==0)
        {
            evensum+=integers;
        }
        else{
            oddsum+=integers;
        }
        
        System.out.println("Do you want to continue ? Press 1 for Continue and Press 0 for exit!");
        choice =sc.nextInt();
    }

        while(choice==1);

        System.out.println("Sum of all Even Number is : "+evensum);
        System.out.println("Sum of All odd Number is :" +oddsum);


    }
}