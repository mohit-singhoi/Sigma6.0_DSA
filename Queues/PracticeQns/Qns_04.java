// Qns 4: Reverse the first k elements of the queue
// We have an integer k and a queue of integers, we need to reverse the first k elements of the queue, keeping the order of the rest of the elements unchanged. We are not allowed to use any data structure other than the queue itself.

package PracticeQns;
import java.util.*;

public class Qns_04 {
    public static void reverseK(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0) {
            return;
        }

        // Step 1: Dequeue first k elements and store in an array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = q.remove();
        }

        // Step 2: Enqueue the elements back in reverse order
        for (int i = k - 1; i >= 0; i--) {
            q.add(temp[i]);
        }

        // Step 3: Move the remaining elements to the back of the queue
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    // Main Function
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        reverseK(q, k);

        System.out.println("Reversed Queue: " + q); // Output: [3, 2, 1, 4, 5]
    }
    
}
