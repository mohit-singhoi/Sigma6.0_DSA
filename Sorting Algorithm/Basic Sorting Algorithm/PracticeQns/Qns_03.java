//  Insertion Sort Algorithm in Java

public class Qns_03 {
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {   // start from 1
            int current = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];   // shift element
                prev--;
            }

            // Insert current element
            arr[prev + 1] = current;
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
        insertionSort(arr);
        printArray(arr);
    }
}
