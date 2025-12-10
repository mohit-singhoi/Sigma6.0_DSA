package Loops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = sc.nextInt();

      
        if (num == 2) {
            System.out.println(num + "is  Prime Number ");

        } else {
              boolean isprime = true;
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == true)
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is Composit");

        }
    }

}
