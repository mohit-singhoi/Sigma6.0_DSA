public class Methods {
    public static void main(String[] args) {
        String str01 = "Hello World! Welcome to Java programming. Java is fun.";

        // 1. Length
        System.out.println("Length: " + str01.length());

        // 2. charAt
        System.out.println("Character at index 5: " + str01.charAt(5));

        // 3. substring
        System.out.println("Substring (6, 11): " + str01.substring(6, 11));

        // 4. toUpperCase
        System.out.println("Uppercase: " + str01.toUpperCase());

        // 5. toLowerCase
        System.out.println("Lowercase: " + str01.toLowerCase());

        // 6. contains
        System.out.println("Contains 'Java': " + str01.contains("Java"));

        // 7. indexOf
        System.out.println("Index of 'Java': " + str01.indexOf("Java"));

        // 8. replace
        System.out.println("Replace 'Java' with 'Python': " + str01.replace("Java", "Python"));

        // 9. trim
        String strWithSpaces = "   Hello World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 10. startsWith
        System.out.println("Starts with 'Hello': " + str01.startsWith("Hello"));

        // 11. endsWith
        System.out.println("Ends with 'fun.': " + str01.endsWith("fun."));

        // 12. equals
        String str02 = "Hello World! Welcome to Java programming. Java is fun.";
        System.out.println("Equals str02: " + str01.equals(str02));

        // 13. equalsIgnoreCase
        String str03 = "hello world! welcome to java programming. java is fun.";
        System.out.println("EqualsIgnoreCase str03: " + str01.equalsIgnoreCase(str03));

        // 14. Split
        String[] parts = str01.split(" ");
        System.out.println("Split by spaces:");
        for (String strPart : parts) {
            System.out.println(strPart);
        }

        // 15. isEmpty
        String emptyStr = "";
        System.out.println("Is emptyStr empty: " + emptyStr.isEmpty());


        // 16. valueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String value of num: " + numStr);


        // 17. concat
        String greet = "Hello, ";
        String name = "Alice";
        System.out.println("Concatenated String: " + greet.concat(name));

    }
}
