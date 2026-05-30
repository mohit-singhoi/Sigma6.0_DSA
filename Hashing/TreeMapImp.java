// 03 : TreeMap Implementation in Java

import java.util.*;

public class TreeMapImp {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 145);
        tm.put("USA", 40);
        tm.put("China", 140);
        tm.put("Russia", 35);
        tm.put("Japan", 25);
        tm.put("Germany", 30);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("USA", 45);
        map.put("China", 140);
        map.put("Russia", 30);
        map.put("Japan", 20);
        map.put("Germany", 25); 

        System.out.println("Simple HashMap Implementation:");
        System.out.println(map);
        System.out.println();
        System.out.println("TreeMap Implementation:");
        System.out.println(tm);

    }
    
}
