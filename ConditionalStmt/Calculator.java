package ConditionalStmt;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number :");
            int fno = sc.nextInt();
            System.out.print("Enter second number :");
            int sno = sc.nextInt();
            System.out.println("Enter a number between 1 to 5 to perform an operation:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5 : Modulus");
            System.out.println("\n");
            System.out.println("Enter your choice:");
            num = sc.nextInt();

        switch(num){
                case 1 :{
                    int sum = fno + sno;
                    System.out.println("Result: " + sum);
                    break;
                }
                case 2 :{
                    int sub = fno - sno;
                    System.out.println("Result: " + sub);
                    break;
                }
                case 3 :{
                    int mul = fno * sno;
                    System.out.println("Result: " + mul);
                    break;
                }
                case 4 :{
                    if (sno != 0) {
                        System.out.println("Result: " + (fno / sno));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                }
                case 5 :{
                    int mod = fno % sno;
                    System.out.println("Result: " + mod);
                    break;
                }
                default : 
                    System.out.println("Invalid input! Please enter a number between 1 and 5.");
                

            }
        }
    }

}
