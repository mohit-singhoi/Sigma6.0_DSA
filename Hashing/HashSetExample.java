import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        HashSet<Integer> numbers = new HashSet<>();

        names.add("Mohit");
        names.add("Rahul");
        names.add("Aman");
        names.add("Mohit"); // Duplicate

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate

        System.out.println(names);
        System.out.println(numbers);

    }
}
