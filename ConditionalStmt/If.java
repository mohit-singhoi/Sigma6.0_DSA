package ConditionalStmt;
import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        int age;
try(Scanner sc = new Scanner(System.in)){
    System.out.print("Enter your age: ");
    age=sc.nextInt();

        if(age<18){
            System.out.println("You are not eligible to vote .");
        }
        if(age>=18){
            System.out.println("You are Adult , eligible to vote.");

        }

        if(age>=25 && age<40){
            System.out.println("You are a Young Adult.");
        }

        if(age>=40 && age<60){
            System.out.println("You are an Senior Adult.");
        }

        if(age>=60){
            System.out.println("You are an Elderly Person (Senior citizen).");
        }
    }}
}
