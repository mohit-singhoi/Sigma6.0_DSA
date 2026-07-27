// Write a program to swap two numbers using a third variable.

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}