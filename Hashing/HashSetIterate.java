import java.util.HashSet;

public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Mohit");
        names.add("Rahul");
        names.add("Aman");

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterating using iterator
        System.out.println("\nIterating using iterator:");
        var iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
