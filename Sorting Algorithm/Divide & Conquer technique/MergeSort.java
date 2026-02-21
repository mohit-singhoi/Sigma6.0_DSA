// Merge Sort is a divide-and-conquer algorithm that sorts an array by recursively dividing it into smaller subarrays, sorting those subarrays, and then merging them back together in the correct order.
public class MergeSort {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergesort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

        public static void merge(int arr[], int left , int mid , int right){
            int temp[] = new int[right - left + 1];
            int i = left; // iterator for the first half
            int j = mid + 1; // iterator for the second half
            int k = 0; // iterator for temp array

            while (i <= mid && j <= right) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }

            // Copy the remaining elements of the first half, if there are any
            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            // Copy the remaining elements of the second half, if there are any
            while (j <= right) {
                temp[k++] = arr[j++];
            }

            // Copy the merged elements back into the original array
            for (i = 0; i < k; i++) {
                arr[left + i] = temp[i];
            }
        }
    

    // Main function
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);

        mergesort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
