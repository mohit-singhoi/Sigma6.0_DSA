// Write an optimized version of the bubble sort algorithm that stops if the array is already sorted. This can be achieved by introducing a flag to check if any swapping occurred during a pass. If no swapping occurred, the array is already sorted and we can break out of the loop early.
public class OptimizedBubbleSort {
    public static void optimizedBubbleSort(int arr[]) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false; // Reset the flag for each pass
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set the flag if a swap occurred
                }
            }
            // If no swapping occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main function to test the optimized bubble sort
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 1, 2, 6, 8, 2};
        optimizedBubbleSort(arr);
        System.out.print("\nSorted Array : ");
        printArr(arr);
    }
}
