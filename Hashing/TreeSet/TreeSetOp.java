import java.util.*;


public class TreeSetOp {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Pune");
        ts.add("Mumbai");
        ts.add("Chicago");
        ts.add("Bengaluru");
        ts.add("Noida");

        System.out.println("TreeSet: " + ts);

        ts.remove("Chicago");
        System.out.println("After removing 'Chicago': " + ts);

        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());


        System.out.println("Contains 'Mumbai': " + ts.contains("Mumbai"));

        
        System.out.println("Size of TreeSet: " + ts.size());

        ts.clear();
        System.out.println("After clearing TreeSet: " + ts);
        System.out.println("Size of TreeSet after clearing: " + ts.size());
    }
}