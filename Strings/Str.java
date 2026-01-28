//Strings in java : it is a array of characters 

public class Str {
    public static void main(String[] args) {
        // Creating a string
        String str1 = "Hello, World!";
        // String str2 = new String("Java Programming");
        String str2 = "Java Programming";

        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Accessing characters
        char ch = str1.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // Substring
        String substr = str2.substring(5, 16);
        System.out.println("Substring of str2: " + substr);

        // String comparison
        boolean isEqual = str1.equals("Hello, World!");
        System.out.println("str1 equals 'Hello, World!': " + isEqual);

        // Changing case
        String upperStr = str2.toUpperCase();
        System.out.println("Uppercase str2: " + upperStr);

        String lowerStr = str2.toLowerCase();
        System.out.println("Lowercase str2: " + lowerStr);
    }
}


