// Demonstration of various StringBuffer methods in Java
// including append, replace, delete, insert, reverse, length, setCharAt, capacity, and ensureCapacity.
// Each method is showcased with a simple example.
// StringBuffer is mutable, allowing modifications without creating new objects.
// Thread-safe due to synchronized methods.

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World

        sb.replace(6, 11, "Java");
        System.out.println(sb.toString()); // Output: Hello Java

        sb.delete(5, 6);
        System.out.println(sb.toString()); // Output: HelloJava

        sb.insert(5, " ");
        System.out.println(sb.toString()); // Output: Hello Java

        sb.reverse();
        System.out.println(sb.toString()); // Output: avaJ olleH


        sb.length();
        System.out.println("Length of StringBuffer: " + sb.length()); // Output: Length of StringBuffer: 10

        sb.setCharAt(0, 'h');
        System.out.println(sb.toString()); // Output: havJ olleH    

        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity); // Output: Capacity of StringBuffer: 21

        sb.ensureCapacity(50);
        System.out.println("New Capacity of StringBuffer: " + sb.capacity()); // Output: New Capacity of StringBuffer: 50
    }

    
}
