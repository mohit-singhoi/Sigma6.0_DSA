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

    public static void main(String[] args) {
        int num[] = { 89, 78, 98, 69, 76 };
        int key = 69;
        // linearsearch(marks, key);

        int index = linearSearch(num, key);
        if (index == -1)
            System.out.println("Key not found");
        else
            System.out.println("Element at index :" +index);
    }

}
