package Functions.PracticeQns;

import java.util.Scanner;

public class Qns_05{
    public static int digitSum(int digit){
        // int n= digit;
        int sum=0;

        while(digit>0){
            int rem=digit%10;
            sum=sum+rem;
            digit=digit/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int n= sc.nextInt();
        System.out.println("Sum of digit " + n + " is : " + digitSum(n));
    }

}