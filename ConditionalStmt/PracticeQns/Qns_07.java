//Write a program to find the 2nd largest value where 5 value is given a,b,c,d,e using if-else.

import java.util.Scanner;

public class Qns_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 Digit ");
        int a = sc.nextByte();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int first, second;

        // Find Largest Value

        if (a > b && b > c && c > d && d > e)
            first = a;

        else if (b > c && c > d && d > e)
            first = b;

        else if (c > d && d > e)
            first = c;

        else if (d > e)
            first = d;
        
        else
            first = e;

        // -------- find 2nd largest ----------
        if (first == a) {
            if (b > c && b > d && b > e)
                second = b;
            else if (c > d && c > e)
                second = c;
            else if (d > e)
                second = d;
            else
                second = e;
        } else if (first == b) {
            if (a > c && a > d && a > e)
                second = a;
            else if (c > d && c > e)
                second = c;
            else if (d > e)
                second = d;
            else
                second = e;
        } else if (first == c) {
            if (a > b && a > d && a > e)
                second = a;
            else if (b > d && b > e)
                second = b;
            else if (d > e)
                second = d;
            else
                second = e;
        } else if (first == d) {
            if (a > b && a > c && a > e)
                second = a;
            else if (b > c && b > e)
                second = b;
            else if (c > e)
                second = c;
            else
                second = e;
        } else {
            if (a > b && a > c && a > d)
                second = a;
            else if (b > c && b > d)
                second = b;
            else if (c > d)
                second = c;
            else
                second = d;
        }

        System.out.println("Largest = " + first);
        System.out.println("Second Largest = " + second);

    }
}