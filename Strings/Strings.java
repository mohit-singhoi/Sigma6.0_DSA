//Strings are immutable in java : it means once created their values cannot be changed  
       
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

       ////char to string
        // char arr[] = {'H', 'e', 'l', 'l', 'o'};
        // String str ="abcde";
        // String str2 = new String("xyz");
        char arr[] = {'H', 'e', 'l', 'l', 'o'};
        String str = "abcde";
        String str2 = new String("xyz");

      //Strings are immutable 

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        name = name + " welcome to java programming";
        System.out.println(name);
        sc.close();

    }
    
}
