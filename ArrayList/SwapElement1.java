// Swap Two element in Arraylist

import java.util.ArrayList;
public class SwapElement1 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){ // int[] arr
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(25);

        int idx1 = 1, idx2 = 3;
        System.out.print("Before Swapping :" +list);

        System.out.println();

        swap(list, idx1, idx2);
        System.out.println("After Swapping : "+list);
        
    }
    
}
