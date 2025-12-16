package Functions;

import java.util.Scanner;

public class Sum3Num {
    public static void  sum3Number(int a, int b, int c){
        int sum= a+b+c;
        System.out.println("Sum :"+sum);
        // return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number!");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum3Number(a, b, 10);
        // int resust =sum3Number(a, b, 10);
        // System.out.println("Sum :"+resust);
        sc.close();
    }
    
}
