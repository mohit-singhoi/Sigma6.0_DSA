// WAP to check given no. is odd or even using least significant digit

import java.util.Scanner;
public class CheckOddEven {
    public static void oddOrEven(int n){
        int bitMask =1;
        if( (n & bitMask) ==0){
            //even number
            System.out.println( n + " is Even Number");
        }
        else{
            System.out.println(n + " is odd Number");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any Number to Check Even/Odd : ");
        n= Sc.nextInt();
        oddOrEven(n);
        Sc.close();
    }

    
}
