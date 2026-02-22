// Qns 1 : Apply a merge sort to sort an array of strings.(assume that all the characters in all the strings are in lowercase).
//  sample input : arr ={"sun","earth","mars","mercury"};
//  sample output : arr = {"earth","mars","mercury","sun"};

public class Qns_01 {

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);       // Left half
        mergeSort(arr, mid + 1, ei);   // Right half
        merge(arr, si, mid, ei);       // Merge both halves
    }

    public static void merge(String arr[], int si, int mid, int ei) {

        String temp[] = new String[ei - si + 1];

        int i = si;        // left pointer
        int j = mid + 1;   // right pointer
        int k = 0;         // temp pointer

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {

        String arr[] = {"sun","earth","mars","mercury"};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}