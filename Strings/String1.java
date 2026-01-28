import java.util.*;

public class String1 {
    public static void main(String[] args) {
        String fullname = "Mohit kumar";
        System.out.println("Name length : " + fullname.length());

        String s1 = "Java";
        String s2 = "Java";

        // Create using new keyword
        String s3 = new String("Java");

        // immutability of String
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Hello

        s = s.concat(" World");
        System.out.println(s);

        // String Creation method
        String fst = "Hello";
        String sec = new String("Hello");
        char[] ch = { 'J', 'a', 'v', 'a' };
        String third = new String(ch);

        System.out.println(fst);
        System.out.println(sec);
        System.out.println(third);

        // Import String Methods
        // Common String methods

        // 1. Length Method
        String Sub = "Java";
        System.out.println(Sub.length()); // 4

        // 2. Character Access
        System.out.println(Sub.charAt(2)); // v

        // 3. SubString
        System.out.println(Sub.substring(2, 4)); // va

        // 4. Case Conversion
        Sub.toUpperCase();
        Sub.toLowerCase();

        System.out.println(Sub.toUpperCase());
        System.out.println(Sub.toLowerCase());

        // 5. Searching
        s.contains("va");
        s.indexOf("a");

        System.out.println(Sub.contains("va"));
        System.out.println(Sub.indexOf("a"));

        // 6. Replace
        Sub.replace("a", "o");

        // 7. Trim : it replace the extra space in string
        String myname = "  Mohit Kumar   ";
        System.out.println(myname.trim());

        // 8. String Concat
        String a = "Hello";
        String b = "Java";
        System.out.println(a + b);

        a = a.concat(b);
        System.out.println(a);

        // 9. equals() : to check the equality
        String first_name = "Mohit";
        String last_name = "Kumar";
        String name1 = "Mohit";

        System.out.println(first_name.equals(last_name)); // false
        System.out.println(first_name.equals(name1)); // true

        // 10. equalsIgnoreCase()
        System.out.println("Java".equalsIgnoreCase("java")); // true

        // 11. Value of : Converts other data type to string.
        int x = 100;
        String strconvert = String.valueOf(x);
        System.out.println(strconvert);

        // 12. isEmpty : check if string is empty
        String string01 = "";
        System.out.println(string01.isEmpty()); // true

        // 13. Split : Split string into array
        String split = "Java,Python,C++";
        String[] arr11 = split.split(",");

        for (String str01 : arr11) {
            System.out.println(str01);
        }

        // 14. Split sentence into words
        String line = "I love Java programming";
        String[] words = line.split(" ");

        for (String w : words) {
            System.out.println(w);
        }

    }
}
