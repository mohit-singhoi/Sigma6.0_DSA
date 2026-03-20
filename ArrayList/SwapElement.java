// WAP to swap two elements in an ArrayList  list = [1,2,3,4,5]  output = [1,4,3,2,5]
import java.util.*;
public class SwapElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        // To swap two elements in an ArrayList, we can use the Collections.swap() method
        Collections.swap(list, 1, 3); // it will swap the elements at index 1 and index 3
        System.out.println("ArrayList after swapping: " + list);

        // Alternatively, we can swap the elements manually using a temporary variable
        int temp = list.get(1); // store the element at index 1 in a temporary variable
        list.set(1, list.get(3)); // set the element at index 1 to the element at index 3
        list.set(3, temp); // set the element at index 3 to the temporary variable
        System.out.println("ArrayList after swapping using loop: " + list);
    }
    
}
