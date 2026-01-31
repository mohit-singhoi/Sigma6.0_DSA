package StringBuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a' ; ch<= 'z';ch++){
            sb.append(ch);
        }

        // O(26)
        System.out.println("Strings are : " +sb);
        System.out.println("Length of String is : " +sb.length());
    }
    
}
