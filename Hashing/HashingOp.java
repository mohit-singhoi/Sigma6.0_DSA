// Hashing oparations

import java.util.*;
public class HashingOp {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer,String> map = new HashMap<>();

        // Insertion : O(1)
        map.put(101,"Mohit");
        map.put(102,"Rahul");
        map.put(103,"Aman");

        System.out.println(map);

        // Searching : O(1)
        String name = map.get(102);
        System.out.println("Name with key 102: " + name);
        System.out.println("Name with key 104: " + map.get(104)); // returns null for non-existing key  

        // Deletion : O(1)
        map.remove(101);
        System.out.println("After deletion: " + map);

        // Update : O(1)
        map.put(103, "Aman Kumar");
        System.out.println("After update: " + map);

        // contains key : O(1)
        boolean hasKey = map.containsKey(102);
        System.out.println("Contains key 102: " + hasKey);

        // contains value : O(n)
        boolean hasValue = map.containsValue("Rahul");
        System.out.println("Contains value 'Rahul': " + hasValue);

        // Size of the map : O(1)
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Clearing the map : O(1)
        map.clear();
        System.out.println("After clearing: " + map);
    }
    
}
