// 2nd : Linked HashMap Implementation

import java.util.*;
public class LinkedHashMapImp {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 145);
        lhm.put("USA", 40);
        lhm.put("China", 140);
        lhm.put("Russia", 35);
        lhm.put("Japan", 25);
        lhm.put("Germany", 30);

        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("USA", 45); 
        map.put("China", 140);
        map.put("Russia", 30);
        map.put("Japan", 20);
        map.put("Germany", 25);

        System.out.println(lhm);
        System.out.println(map);
    }

    
}
