// Counting Sort Algorithm in Java

public class Qns_04 {

    public static void countingSort(int arr[]) {
        int n = arr.length;

        // Step 1: Find maximum element
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Step 2: Create count array to count the frequency of each element
        int count[] = new int[max + 1];

        // Step 3: Store frequency of each element
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }

        // Step 4: Reconstruct sorted array
        int index = 0;
        for(int i = 0; i <= max; i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    // Print the Sorted Array
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.print("Sorted Array : ");
        countingSort(arr);
        printArray(arr);
    }
}
