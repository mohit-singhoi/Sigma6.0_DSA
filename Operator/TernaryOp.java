import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        
        int num;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to check even or odd:");
            num = sc.nextInt();
            String result = (num % 2 == 0) ? "Even" : "Odd";
            System.out.println("The number is: " + result);
        
        }
    }
    
}
