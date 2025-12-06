import java.util.Scanner;
public class Calculate{
    public static void main(String[] args) {
     java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();

        System.out.print("Enter Second Number :");
        int b= sc.nextInt();

        System.out.print("\nEnter Operator :");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                int sum= a+b;
                System.out.println("Sum :"+sum);
                break;

             case '-':
                int sub= a-b;
                System.out.println("Sub :"+sub);
                break;

             case '*':
                int mul= a*b;
                System.out.println("Mul :"+mul);
                break;
            
             case '/':
                int div= a/b;
                System.out.println("Div :"+div);
                break;

             case '%':
                int mod= a%b;
                System.out.println("Modulo :"+mod);
                break;
            default:
               System.out.println("Enter Valid Oparator!");
        }
     
    }
}