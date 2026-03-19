import java.util.ArrayList;

// ArrayList is a part of the Java Collections Framework and is used to store dynamically sized collections of elements. It provides methods to manipulate the size of the array that is used internally to store the list. The ArrayList class is found in the java.util package, so you need to import it before using it in your code.
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        // ArrayList is a resizable array implementation of the List interface
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Access element
        System.out.println(list.get(1)); // 20

        // Update element
        list.set(1, 50);

        // Remove element
        list.remove(2);

        System.out.println(list);
    }
}