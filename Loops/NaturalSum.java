package Loops;
import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range Number :");
        int n = sc.nextInt();
        int sum=0;
        int count=1;

        while(count<=n){
            sum=sum+count;
            count++;
        }
        System.out.println("The Sum of Natural Numbers upto "+n+" is : "+sum);
        sc.close();
    }
    
}
