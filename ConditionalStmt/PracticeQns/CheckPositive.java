package PracticeQns;
import java.util.Scanner;
public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number :");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num>0){
            System.out.println(num+ " is Positive");

        }
        else
            System.out.println(num + "is Negative ");

    }
    
}
