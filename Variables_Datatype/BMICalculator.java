// Write a Program to Calculate BMI (Body Mass Index)
// Formula : BMI = (Wt(kg)/ht(m^2))

//Where:
// Weight = in kilograms (kg)
// Height = in meters (m)

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (feet): ");
        double heightFeet = sc.nextDouble();

        // Convert feet to meters
        double heightMeter = heightFeet * 0.3048;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        System.out.printf("\nYour BMI = %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        sc.close();
    }
}