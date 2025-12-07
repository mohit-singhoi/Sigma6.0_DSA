package Loops;
import java.util.Scanner;
public class PrintEven{
    public static void main(String[] args) {
        Scanner sc = n ew Scanner(System.in);
        System.out.println("Enter the value of N to print even numbers up to N:");
        int n=sc.nextInt();
       
        System.out.println("Even numbers from 1 to "+n+" are:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}