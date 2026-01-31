package StringBuilder;

public class Demo {
    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length
        System.out.println("Length of StringBuilder: " + sb.length());
    }
    
}
