package PracticeQns;
import java.util.Scanner;
public class Qns_06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Charcter :");
    char ch = sc.next().charAt(0);

    if(ch>=48 && ch<=57){
        System.out.println("Enter Charcater is Digit ");
    }
    else if (ch>=65 && ch<=90){
        System.out.println(" Given Character is Alphabet Upper Case");

    }
    else if(ch>=97 && ch<=122){
        System.out.println("Giver Character is Alphabet Lower Case");
    }
    else
        System.out.println("Given Character is Special Character");

    }

    
}
