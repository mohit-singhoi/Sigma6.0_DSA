package ConditionalStmt;

import java.util.Scanner;

public class Switchstmt {
    public static void main(String[] args) {
        int num;
        try ( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number between 1 to 7 to get the corresponding day of the week:");
            num = sc.nextInt();

            switch (num) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        }
    }
    
}
