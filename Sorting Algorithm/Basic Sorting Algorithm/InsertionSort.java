// InsertionSort.java
// Implementation of Insertion Sort algorithm in Java

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int curr =arr[i];
            int prev = i-1;
            
            //Finding out the  Correct Position to insert 
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] =arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,1,10,5,2};
        System.out.print("Sorted Array is : ");
        insertionSort(arr);
        printArr(arr);
    }
}
