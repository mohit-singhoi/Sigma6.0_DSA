// WAP to reverse an ArrayList  list = [1,2,3,4,5]  output = [5,4,3,2,1]
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) { // O(n) time complexity : it return  5,4,3,2,1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original ArrayList: " + list);

        // To reverse the ArrayList, we can use the Collections.reverse() method
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);

        // Alternatively, we can reverse the ArrayList manually using a loop
        System.out.println("Reversed ArrayList using loop: ");  // O(n) time complexity : it return  1,2,3,4,5 because 1 time we already reverse the list using Collections.reverse() method.
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
