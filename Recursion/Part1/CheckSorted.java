// Check if a Given array is sorted or not.
public class CheckSorted{

    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] >  arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    // Main Function
    public static void main(String[] args){
       // int arr[] = {7,9,1,2,7,3};
       int arr[] = {1,4,7,9,12,36};
        System.out.println("Array is Sorted : " +isSorted(arr, 0));
        
    }
}