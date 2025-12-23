package Functions;
import java.util.Scanner;

public class CheckPrime {
  ////Generalized Code
    // //Only for n>=2
    // public static boolean primeCheck(int n){
    //     // boolean isprime=true;

    //     //corrner case
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //         // isprime=false;
    //         return false;
    //         // break;
    //         }
    //     }
    // //    return isprime;
    //    return true;
    // }


    //Optimized Code
    public static boolean primeCheck(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number to Check Given Number is Prime or Not :");
        int n= sc.nextInt();
        System.out.println(n + " is Prime ? : "+ primeCheck(n));
    }

    
}
