package Functions.PracticeQns;
import java.util.Scanner;

public class Qns_02 {
    public static boolean isEven(int n){
        if(n%2==0) 
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check even or not :");
        int n=sc.nextInt();
        System.out.println(n+ " is Even ? : " +isEven(n));
    }
    
}
