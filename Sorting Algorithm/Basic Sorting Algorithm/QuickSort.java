public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        // Swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort method

    public static void quickSort(int arr[] , int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            // Recursively sort left and right subarrays
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    // Main Method
    public static void main(String[] args) {
        int arr[] = { 7, 9, 0, 98, 78, 5, 6 };
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
