// WAP to implement Bubble sort Algorithm to sort the given array
//Unsorted Array is {5,4,1,3,2}
//Increasing Order :{1,2,3,4,5}
//Decreasing Order :{5,4,3,2,1}  

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                ////1. Ascending Order
                // if (arr[j] > arr[j + 1]) {
                // int temp = arr[j];
                // arr[j] = arr[j + 1];
                // arr[j + 1] = temp;
                // }

                ////2. Decending Order
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        ////1.Print Array in Ascending Order
        // System.out.print("Sorted Array in Ascending Order : ");
        ////2.Print Array in Decending Order
        System.out.print("Sorted Array in Ascending Order : ");
        bubbleSort(arr);
    }

}
