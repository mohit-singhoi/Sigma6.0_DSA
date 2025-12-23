package Functions.PracticeQns;
import java.util.Scanner;

public class Qns_01 {
    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three Number :");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("Avg of three Number : " + avg(a, b, c));
    }
    
}
