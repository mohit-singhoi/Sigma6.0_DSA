public class CountVowel {
    public static void main(String[] args) {
        // String str = "Hello World";
        // int vowelCount = 0;

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        // ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        // vowelCount++;
        // }
        // }

        // System.out.println("Number of vowels in the string: " + vowelCount);
        // }

        // //2. Alternative approach using switch-case
        // String str = "Hello World";
        // int vowelCount = 0;

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // switch (ch) {
        // case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vowelCount++;
        // }
        // }

        // System.out.println("Number of vowels in the string: " + vowelCount);
        // }

        // //3. Using indexOf method
        // String str = "Hello World";
        // int vowelCount = 0;
        // String vowels = "aeiouAEIOU";

        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (vowels.indexOf(ch) != -1) {
        // vowelCount++;
        // }
        // }

        // System.out.println("Number of vowels in the string: " + vowelCount);
        // }

        // //4. Using regular expressions
        // String str = "Hello World";
        // String vowelsOnly = str.replaceAll("[^aeiouAEIOU]", "");
        // int vowelCount = vowelsOnly.length();

        // System.out.println("Number of vowels in the string: " + vowelCount);
        // }

    // // 5. Using streams (Java 8 and above)
    // String str = "Hello World";
    // long vowelCount = str.chars()
    // .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
    // .count();

    //     System.out.println("Number of vowels in the string: " + vowelCount);
    // }

    // 6. Using enhanced for loop
    String str = "Hello World";
    int vowelCount = 0;
    for (char ch : str.toCharArray()) {
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            vowelCount++;
        }
    }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }

}
