// Array Operations
//1. Array Creation
//2. Input Data
//3. Output Data
//4. Update Data

package Arrays.Array_Part1;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50]; // creation of int type array

        int numbers[] = { 1, 2, 3, 4, 5 }; // data included

        String fruits[] = { "apple", "mango", "Guava" }; // String type data

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter marks ");
        for (int i = 1; i <= n; i++) {
            marks[i] = sc.nextInt();
        }


         System.out.println("\n\nMarks ");
        for (int i=1;i<=n;i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nNumbers");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nFruits");
        for (String i : fruits) {
            System.out.print(i + " ");
        }

    }

}
