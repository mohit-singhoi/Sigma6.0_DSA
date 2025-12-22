package Functions;
import java.util.Scanner;

public class CheckPrime {
  
    public static boolean primeCheck(int n){
        // boolean isprime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
            // isprime=false;
            return false;
            // break;
            }
        }
    //    return isprime;
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number to Check Given Number is Prime or Not :");
        int n= sc.nextInt();
        System.out.println(n + " is Prime ? : "+ primeCheck(n));
    }

    
}
