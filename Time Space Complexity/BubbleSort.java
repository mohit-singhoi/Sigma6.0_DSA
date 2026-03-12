// General Bubble sort Algorithm
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void  printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Main fun
    public static void main(String[] args) { // TC O(n^2)  in Both case Best case and worst case and SC O(1)
        int arr[] = {5,7,9,1,2,6,8,2};
        bubbleSort(arr);
        System.out.print("\nSorted Array : ");
        printArr(arr);
        
    }
}
