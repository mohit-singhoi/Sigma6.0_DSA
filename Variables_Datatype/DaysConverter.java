//  Write a Program to Convert Total Days into Years, Months, and Days

// Assumption:

// 1 Year = 365 days
// 1 Month = 30 days

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println("\nEquivalent Time:");
        System.out.println("Years  : " + years);
        System.out.println("Months : " + months);
        System.out.println("Days   : " + days);

        sc.close();
    }
}