public class SelectonSort {
    public static void selectonSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;

                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.print("Sorted Array is : ");
        selectonSort(arr);
        printArr(arr);
    }

}
