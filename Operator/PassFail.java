import java.util.Scanner;

public class PassFail {
public static void main(String[] args) {
    int marks;
    try( Scanner sc = new Scanner(System.in)){
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        String result = (marks >= 40) ? "Passed" : "Failed";

        System.out.println("You : " + result);
    }
}
}
    

