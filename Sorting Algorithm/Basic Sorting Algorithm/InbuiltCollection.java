// InbuiltCollection.java
//Wap to sort an array using collection in reversed order

import java.util.*;

public class InbuiltCollection {
    public static void inbuiltCollection(Integer arr[]){
        int n= arr.length;

        ////1st way sort for whole array
        //Arrays.sort(arr,Collections.reverseOrder());


        //2nd way to sort in a given range 
        //Sort Arrays from 0 to 3 rd element
        Arrays.sort(arr,0,4,Collections.reverseOrder());


        //Print sorted arrays
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Integer arr[] ={5,2,8,12,0,76};
        System.out.print("Arrays in Sorted Order : ");
        inbuiltCollection(arr);
        
    }
}
