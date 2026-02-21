// QuickSort.java
// WAP to implement Quick Sort algorithm  using recursion and print the sorted array. Also, analyze the time and space complexity of the algorithm.

public class QuickSort {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[] , int si, int ei){
        // last element as pivot
        if (si < ei) {
            int pivotIndex = partition(arr, si, ei);
            quickSort(arr, si, pivotIndex - 1); // Recursively sort elements before partition  ( Left half )
            quickSort(arr, pivotIndex + 1, ei); // Recursively sort elements after partition ( Right half )
        }
        else {
            return;
        }

    }

    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei]; // Choosing the last element as pivot
        int i = si - 1; // Pointer for the smaller element

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++; // Increment index of smaller element for the final swap
        // Swap arr[i] and arr[ei] (or pivot)

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // Return the partitioning index
    }

    // Main function
    // TC = O(n log n) - The average and best-case time complexity occurs when
    // the pivot divides the array into two equal halves. The worst-case time complexity occurs when the smallest or largest element is always chosen as the pivot, leading to O(n^2) time complexity.
    // SC = O(log n) - The space complexity is O(log n) on average
    // due to recursive calls. In the worst case (when the smallest or largest element is always chosen as the pivot), the space complexity can degrade to O(n) due to deep recursion.

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

// Note : 
// In quickSort worst case occurs when the smallest or largest element is always chosen as the pivot,
// leading to O(n^2) time complexity. This can happen, for example, if the input array is already sorted or reverse sorted. 
// To mitigate this issue, various strategies can be employed to choose a better pivot, such as using the median of the first, middle, and last elements (median-of-three) or selecting a random pivot.
