// Find peak element in an array

public class Qns_06{
  public static int findPeak(int[] arr, int left, int right) {
    int mid = left + (right - left) / 2;

    // Check if mid is a peak element
    if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
        return mid;
    }

    // If the left neighbor is greater than mid, then there must be a peak in the left half
    if (mid > 0 && arr[mid - 1] > arr[mid]) {
        return findPeak(arr, left, mid - 1);
    }

    // Else there must be a peak in the right half
    return findPeak(arr, mid + 1, right);
 }

 //Main function
 public static void main (String [] args){
    int[] arr = {1, 3, 20, 4, 1, 0};
    int peakIndex = findPeak(arr, 0, arr.length - 1);
    System.out.println("Peak element is at index: " + peakIndex + " with value: " + arr[peakIndex]);

}
}