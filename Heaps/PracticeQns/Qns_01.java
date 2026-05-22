// Qns_01.java : K'th largest element in the stream
// Given an infinite stream of integers, find the k'th largest element at any point in

// Input : k = 3, stream = [10,20,11,70,50,40,100,5,...]
// Output : {_, _, 10, 11, 20, 40, 50, 50,...}


package PracticeQns;
import java.util.*;
public class Qns_01 {
    public static void main(String[] args) {
        int k = 3;
        int[] stream = {10, 20, 11, 70, 50, 40, 100, 5};

        // We can use a min-heap (priority queue) to keep track of the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        System.out.println("The k'th largest elements in the stream are:");
        for (int num : stream) {
            minHeap.add(num);

            // If the size of the heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }

            // The k'th largest element is now at the root of the min-heap
            if (minHeap.size() == k) {
                System.out.print(minHeap.peek() + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }
    
}
