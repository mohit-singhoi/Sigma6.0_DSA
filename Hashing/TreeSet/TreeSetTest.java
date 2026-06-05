package TreeSet;
import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Chicago");
        cities.add("Bengaluru");
        cities.add("Noida");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Chicago");
        lhs.add("Bengaluru");
        lhs.add("Noida");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Pune");
        ts.add("Mumbai");
        ts.add("Chicago");
        ts.add("Bengaluru");
        ts.add("Noida");
        
        // Print the sets to see the order of elements
        System.out.println("HashSet: " + cities);

        // HashSet does not maintain any order, so the output may be in random order
        System.out.println("LinkedHashSet: " + lhs);

        // TreeSet maintains natural ordering (alphabetical for strings), so the output will be sorted
        System.out.println("TreeSet: " + ts);


        
    }
    
}
