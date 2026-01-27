import java.util.*;

public class Qns_05 {
    public static void inBuiltSort(int arr[]) {
        Arrays.sort(arr);
    }
    
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.print("Sorted Array : ");
        inBuiltSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
