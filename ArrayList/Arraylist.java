import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // 1. Add Operation - O(1)
        list1.add(1); 
        list1.add(2);
        list1.add(5);
        list1.add(1);
        list1.add(10);

        System.out.println(list1);

        // 2. Get Operation - O(1)
        int element = list1.get(2);
        System.out.println(element);
        System.out.println("Get First Element : " +list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.get(3));


        // 3. Delete Operation - O(1)
        list1.remove(2);
        System.out.println(list1);
    }
}
