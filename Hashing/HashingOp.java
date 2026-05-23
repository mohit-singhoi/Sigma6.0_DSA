// Hashing oparations

import java.util.*;
public class HashingOp {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        // Insertion
        map.put(101,"Mohit");
        map.put(102,"Rahul");
        map.put(103,"Aman");

        System.out.println(map);

        // Searching
        String name = map.get(102);
        System.out.println("Name with key 102: " + name);

        // Deletion
        map.remove(101);
        System.out.println("After deletion: " + map);

        // Update
        map.put(103, "Aman Kumar");
        System.out.println("After update: " + map);

        // contains key
        boolean hasKey = map.containsKey(102);
        System.out.println("Contains key 102: " + hasKey);

        // contains value
        boolean hasValue = map.containsValue("Rahul");
        System.out.println("Contains value 'Rahul': " + hasValue);

        // Size
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Clearing the map
        map.clear();
        System.out.println("After clearing: " + map);
    }
    
}
