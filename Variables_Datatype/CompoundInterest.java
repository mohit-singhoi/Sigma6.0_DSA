// Write a Program to Calculate Compound Interest
// Formula : FV = PV(1+r)^n

// Where:
// PV = Principal Amount
// FV = Final Amount
// r = Interest Rate (in decimal form)
// n = Number of Years


// Compound Interest= Final Amount- Principal

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        int time = sc.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.printf("\nCompound Interest = %.2f%n", compoundInterest);
        System.out.printf("Total Amount = %.2f%n", amount);

        sc.close();
    }
}
