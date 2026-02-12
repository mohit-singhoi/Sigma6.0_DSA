import java.util.Scanner;
public class Qns_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Num  : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Num  : ");
        int b = sc.nextInt();

        Complex c = new Complex();
        System.out.println("Sum : " +c.sum(a, b));
        System.out.println("Difference : " +c.sub(a, b));
        System.out.println("Product : " +c.product(a, b));

    }
}
class Complex{
    int sum(int a , int b){
        return a+b;
    }

    int sub(int a , int b){
        return a-b;

    }

    int product(int a ,int b){
        return a*b;
    }
}