
//WAP to sort an array using Counting Sort algorithm

public class CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        int n= arr.length;
        //Finding the largest element in the array
        for(int i=0;i<n;i++){
            largest = Math.max(largest, arr[i]);
        }

        //Creating the frequency array
        int freq[] = new int[largest+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        //Sorting the original array using frequency array
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 7, 3, 3, 1 };
        countingSort(arr);
        System.out.print("Sorted Array is : ");
        printArr(arr);

    }

}
