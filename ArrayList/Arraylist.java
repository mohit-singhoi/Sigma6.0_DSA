//Perform ArrayList Operations in Java
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();

        ArrayList<Integer> list1 = new ArrayList<>(); // ArrayList of Integer type
      //  ArrayList<String> list2 = new ArrayList<>(); // ArrayList of String type
       // ArrayList<Boolean> list3 = new ArrayList<>(); // ArrayList of Boolean type

        // 1. Add Operation - O(1)
        list1.add(1); 
        list1.add(2);
        list1.add(5);
        list1.add(1);
        list1.add(10);

        list1.add(1,13); // O(n) it will add 13 at index 1 and shift the rest of the elements to the right.

        System.out.println("Size of list1 : " +list1.size());

        System.out.println(list1);

        // 2. Get Operation - O(1)
        int element = list1.get(2);
        System.out.println(element);
        System.out.println("Get First Element : " +list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.get(3));


        // 3. Delete Operation - O(n)  it take linear time.
        list1.remove(2);
        System.out.println(list1);


        // 4. Set Operation - O(n)
        list1.set(2, 100);
        System.out.println(list1);


        //Contains Operation - O(n)
        System.out.println(list1.contains(100));
        System.out.println(list1.contains(5));
    }
}
