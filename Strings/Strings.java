//Strings are immutable in java : it means once created their values cannot be changed  

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        //// char to string
        // char arr[] = {'H', 'e', 'l', 'l', 'o'};
        // String str ="abcde";
        // String str2 = new String("xyz");
        char arr[] = { 'H', 'e', 'l', 'l', 'o' };
        String str = "abcde";
        String str2 = new String("xyz");

        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is: " + name);
        // name = name + " welcome to java programming";
        // System.out.println(name);
        // sc.close();

        // String immutability example
        String s = "Java";
        s.concat(" Programming");
        System.out.println(s); // Output: Java
        s = s.concat(" Programming");
        System.out.println(s); // Output: Java Programming

        // finding length of string String example = "Hello, World!";
        String example = "Hello, World!";
        int length = example.length();
        System.out.println("Length of the string: " + length); // Output: 13

        // Common string methods
        String Name = "  Mohit Kumar  ";

        System.out.println(Name.length()); // 12
        System.out.println(Name.trim()); // "Hello Java"
        System.out.println(Name.charAt(1)); // 'H'
        System.out.println(Name.contains("Java"));// true


    }

}
