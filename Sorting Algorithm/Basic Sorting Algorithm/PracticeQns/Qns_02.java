public class Qns_02 {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            // Swap
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
    }

    // Print the Sortted Array
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.print("Sorted Array :");
        selectionSort(arr);
        printArray(arr);
    }
}
