// WAP to check if the given number is pallindrome or not using functions.

package Functions.PracticeQns;
import java.util.Scanner;

public class Qns_03 {
    public static boolean ispallindrome(int num){
        int originalnum= num;
        int rev= 0;
        while(num>0){
            int rem= num%10;
            rev= rev*10 + rem;
            num= num/10;
        }
        return originalnum == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check it is pallindrome or not : ");
        int n= sc.nextInt();
        if(ispallindrome(n)){
            System.out.println(n + " is a pallindrome number.");
        }
        else{
            System.out.println(n + " is not a pallindrome number.");
        }
    }
    

}
