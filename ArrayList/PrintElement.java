//

import java.util.ArrayList;

public class PrintElement {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); // ArrayList of Integer type
        ArrayList<String> list2 = new ArrayList<>(); // ArrayList of String type

        list1.add(1);
        list1.add(2);
        list1.add(3);   
        list1.add(4);
        list1.add(5);

        list2.add("Hello");
        list2.add("World");

        // Size of list1
        System.out.println("Size of list1: " + list1.size());

        // Size of list2
        System.out.println("Size of list2: " + list2.size());

        // Print elements of list1
        System.out.println("Elements of list1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) +" ");
        }
        System.out.println();

        // Print elements of list2
        System.out.println("Elements of list2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i)+" ");
        }
    }
}
