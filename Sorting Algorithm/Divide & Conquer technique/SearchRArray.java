// WAP to search an element in a sorted and rotated array.
// input : sorted , rotated array with distinct numbers(in ascending order) It is rotated at a pivot point. Find the index of given element.
// Example : arr[] = {4, 5, 6, 7, 0, 1, 2} , target = 0
// output : 4 (index of target element in the array)

public class SearchRArray {
    public static int search(int arr[], int tar, int si, int ei){
        if (si > ei) {
            return -1; // Base case: target not found
        }

        int mid = si + (ei - si) / 2; // (si+ei)/2 // Calculate the middle index

        if (arr[mid] == tar) {
            return mid; // Target found at index mid
        }

       // Mid is in the left half
        if (arr[si] <= arr[mid]) {

            // Case 1 : Target is in the left half
            if (tar >= arr[si] && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1); // Search in the left half
            } else {
                // Case 2 : Target is in the right half
                return search(arr, tar, mid + 1, ei); // Search in the right half
            }
        }
        // Mid is in the right half
        else {
            // case  3 : Target is in the right half
            if (tar > arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei); // Search in the right half
            } else {

            // case 4 : Target is in the left half
                return search(arr, tar, si, mid - 1); // Search in the left half
            }
        }
    }

    // Main function
    // TC = O(log n) - The algorithm performs a binary search, which has a logarithmic time complexity.
    // SC = O(log n) - The space complexity is O(log n) due to the recursive calls. In the worst case, the recursion depth can go up to
    // O(log n) when the target is found or not found in the array.

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int n = arr.length;

        int result = search(arr, target, 0, n - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
