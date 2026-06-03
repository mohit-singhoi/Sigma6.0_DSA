import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Pune");
        cities.add("Hyderabad");
        cities.add("Mumbai"); // Duplicate

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Pune");
        lhs.add("Hyderabad");
        lhs.add("Mumbai"); // Duplicate

        System.out.println(lhs);
    }

}
