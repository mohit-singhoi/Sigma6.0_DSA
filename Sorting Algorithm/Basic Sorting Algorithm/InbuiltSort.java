// InbuiltSort.java
//WAP to sort an array using inbuilt function

import java.util.*;

public class InbuiltSort {
    public static void inbuiltSort(int arr[]){
        int n= arr.length;
        //1st way thats containing total arrays
        // Arrays.sort(arr);

        //2nd way : That containes only that you given b/w the range 
        //it sort only 1st 3 arrays element
        Arrays.sort(arr,0,3);



        //Print Sorted Arrays
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={6,4,12,9,1,0,54};
        inbuiltSort(arr);
    }
    
}
