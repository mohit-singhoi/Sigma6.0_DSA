package PracticeQns;
import java.util.Scanner;

public class Weekname {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Menu:\n1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thrusday\n6. Friday\n7. Saturday\n8. Exit");
    while(true){
    System.out.print("Enter Number :");
    int num= sc.nextInt();

    switch(num){
        case 1:System.out.println("Sunday");
        break;

        case 2:System.out.println("Monday");
        break;

        case 3:System.out.println("Tuesday");
        break;

        case 4:System.out.println("Wednesday");
        break;

        case 5:System.out.println("Thrusday");
        break;

        case 6:System.out.println("Friday");
        break;

        case 7:
            System.out.println("Saturday");
            break;

        case 8:
            System.out.println("Exiting...");
            System.exit(0);
            break;
        default:System.out.println("Invalid Input , Please Enter a valid input");

    }
    }
}

    
}
