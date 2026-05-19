// Heap Sort Algorithm

public class HeapSort {

    public static void heapify(int arr[], int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < n && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < n && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        if (maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, n);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step1 : Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i,n);
        }

        // Step2 : Remove elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap :Largest element (root) with the last element of the heap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) { // O(nlogn)
        int[] arr = {1,2,4,5,3};

        // Before sorting
        System.out.println("Before Heap Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nAfter Applying Heap Sort:");
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
