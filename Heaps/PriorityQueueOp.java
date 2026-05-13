import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueOp {
    public static void main(String[] args) {

      // For Ascending order : Low value first priority
      //  PriorityQueue<Integer> pq = new PriorityQueue<>();

      // For Descending Order : High value first priority
      PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(40); // O(logn)
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }
    }
}