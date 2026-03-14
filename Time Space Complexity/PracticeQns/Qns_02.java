package PracticeQns;

public class Qns_02 {
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2; // to avoid overflow
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1; // target not found
    }

    // Main function
    public static void main(String[] args) { // TC = O(log N) and SC = O(1) due to iterative approach
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found in the array.");  
        }
    }   
    
}
