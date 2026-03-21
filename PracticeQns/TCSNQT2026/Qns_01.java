// Given a purchase amount, calculate the discount based on the following slabs and print the final payable amount rounded to 2 decimal places.
// - For purchase amount <1000 5% discount.
// - For purchase amount >=1000 and <5000 10% discount.
// - For purchase amount >=5000 15% discount.

import java.util.Scanner;

public class Qns_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Amount : ");
        int amount = sc.nextInt();

        float discount;
        float finalamt;
        if (amount < 1000) {
            discount = (amount * 5) / 100;
            finalamt = amount - discount;

            System.out.printf("Final PAyable Amount : %.2f  " , finalamt);
        }

        else if (amount >= 1000 && amount < 5000) {
            discount = (amount * 10) / 100;
            finalamt = amount - discount;
            System.out.printf("Final Payable Amount : %.2f  " , finalamt);

        }

        else {
            discount = (amount * 15) / 100;
            finalamt = amount - discount;
            System.out.printf("Final PAyable Amount : %.2f  " , finalamt);
        }

        sc.close();
    }
}
