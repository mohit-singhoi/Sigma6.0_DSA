import java.util.Scanner;
public class AssignmentOp{
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();

            int c=0;
            c+=a; // Assignment + operation
            System.out.println("After += operation, c = " + c);
            a*=b; // Assignment * operation
            System.out.println("After *= operation, d = " + a);

            a-=b; // Assignment - operation
            System.out.println("After -= operation, a = " + a);
            a/=b; // Assignment / operation
            System.out.println("After /= operation, a = " + a);
            a%=b; // Assignment % operation
            System.out.println("After %= operation, a = " + a);


        sc.close();
        }
    }
}