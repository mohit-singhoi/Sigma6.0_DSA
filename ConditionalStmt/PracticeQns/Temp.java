package PracticeQns;
import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Body Temperature in Celsius:");
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("You have a Fever.");
        }
        else{
            System.out.println("You don't have Fever, Your Temperature is Normal.");
        }
    }
    
}
