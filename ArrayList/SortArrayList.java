// WAP to sort an ArrayList  list = [5,4,3,2,1]  output = [1,2,3,4,5]
import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("Original ArrayList: " + list);

        // To sort the ArrayList, we can use the Collections.sort() method
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        // Alternatively, we can sort the ArrayList manually using a loop
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    // Swap the elements at index i and index j
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Sorted ArrayList using loop: " + list);


        // Return in Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in Descending order: " + list);

        // Comparator :  Custom sorting logic
    }
    
}
