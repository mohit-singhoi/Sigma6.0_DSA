package ConditionalStmt;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
        int num;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                System.out.println(num + " is an Even number.");
            } else {
                System.out.println(num + " is an Odd number.");
            }
        }
    }
}
    

