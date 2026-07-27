import java.util.*;

public class LinearSearch {

    // public static void linearsearch(int marks[], int key){
    // for(int i=0;i<marks.length;i++){
    // if(marks[i]==key){
    // System.out.println("Key is found on the index of :"+i);
    // return;
    // }
    // }
    // System.out.println("Key not found");
    // }

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key)
                return i;
        }
        return -1;
    }

    public static int seachmenu(String menu_item[], String item){
        for(int i=0;i<menu_item.length;i++){
            if(menu_item[i]==item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 89, 78, 98, 69, 76 };
        String menu_item[] ={"Samosa", "Chole Bhutre", "Dahi", "Juice","Momoes"};
        int key = 69;
        String item="Dahi";
        // linearsearch(marks, key);

        int index = linearSearch(num, key);
        if (index == -1)
            System.out.println("Key not found");
        else
            System.out.println("Element at index :" +index);

        int index1= seachmenu(menu_item, item);
        if(index==-1){
            System.out.println("item not found");
        }
        else
            System.out.println("item found at index :"+index1);
    }

}
