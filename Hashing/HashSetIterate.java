import java.util.*;

public class HashSetIterate {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Mumbai"); // Duplicate

        // Iterating using for-each loop : Advance for loop
        System.out.println("Iterating using for-each loop:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterating using iterator
        System.out.println("\nIterating using iterator:");
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
