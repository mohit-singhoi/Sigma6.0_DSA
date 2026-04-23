// Qns 5: maximum of all Subarrays of size k
// We have an arr[] of size n and an integer k, we need to find the maximum of all subarrays of size k. using a queue data structure.
// Sample Input : N=8, K=3, arr[] = {1, 2, 3, 1, 4, 5, 2, 3}
// Sample Output : 3 3 4 5 5 3
package PracticeQns;
import java.util.*;
public class Qns_05 {
    public static void maxOfSubarrays(int[] arr, int k) {
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove elements that are out of this window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.removeFirst();
            }

            // Remove elements smaller than the current element from the back of the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.removeLast();
            }

            // Add current element index to the back of the deque
            deque.addLast(i);

            // The front of the deque is the largest element for the current window
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }

        // Print the result
        System.out.println(result);
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3};
        int k = 3;
        System.out.println("Maximum of all Subarrays of size " + k + ":");
        maxOfSubarrays(arr, k); // Output: [3, 3, 4, 5, 5, 3]
    }
        

    
}
