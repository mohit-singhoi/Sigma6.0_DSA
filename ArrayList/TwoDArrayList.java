// WAP to create a 2D ArrayList in Java.

import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); 
        list.add(2);
        mainList.add(list);

        ArrayList<Integer>  list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);


        //Print the MainList
        for(int i=0;i<mainList.size();i++){
         ArrayList<Integer> currList = mainList.get(i);
         for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+ " ");
         }
         System.out.println();
        }
    }
    
}
