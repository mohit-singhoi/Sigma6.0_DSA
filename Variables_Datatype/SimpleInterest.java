// Write a Program to Calculate Simple Interest
// Simple Interest : (P * R * T) / 100

// Where:
// P = Principal Amount
// R = Rate of Interest (%)
// T = Time (Years)

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("\nSimple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);

        sc.close();
    }
}