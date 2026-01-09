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

        // Enter Data in Array : Input the data
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter marks ");
        for (int i = 1; i <= n; i++) {
            marks[i] = sc.nextInt();
        }

        //Update the value in Array
        int updateIndex, newValue;
        System.out.print("Enter the index to update : ");
        updateIndex = sc.nextInt();
        System.out.print("Enter the new value : ");
        newValue = sc.nextInt();
        marks[updateIndex] = newValue; // Update Data in Array


        //Output or Print the data 
        System.out.println("\n\nMarks ");
        for (int i = 1; i <= n; i++) {
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
