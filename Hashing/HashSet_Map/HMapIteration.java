// Perform Iterations on HashMap

import java.util.*;
public class HMapIteration {
    public static void main(String[] args) {// O(n) for iteration

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("USA", 45);
        map.put("China", 140);
        map.put("Russia", 30);
        map.put("Japan", 20);
        map.put("Germany", 25);

        //Iterate
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // Iterate using for each loop
        System.out.println("Iterating using for each loop:");
        System.out.println("Key : Value");
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

       
    }
    
}
