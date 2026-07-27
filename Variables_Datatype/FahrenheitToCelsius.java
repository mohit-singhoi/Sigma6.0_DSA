// Write a Program to Convert Fahrenheit to Celsius
// Formula : C = (5/9)*(F-32)

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius + "°C");

        sc.close();
    }
}