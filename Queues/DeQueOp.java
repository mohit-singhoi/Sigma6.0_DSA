// WAP to implement DeQue operations in JCF.
import java.util.*;
public class DeQueOp {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        // addFirst() : O(1)
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3); // Deque : [3, 2, 1]

        // addLast() : O(1)
        dq.addLast(4); 
        dq.addLast(5);
        dq.addLast(6); // Deque : [3, 2, 1, 4, 5, 6]

        System.out.println("Deque : " + dq);

        // removeFirst() : O(1)
        System.out.println("Removed from front : " + dq.removeFirst());

        // removeLast() : O(1)
        System.out.println("Removed from rear : " + dq.removeLast());

        System.out.println("Deque after removals : " + dq);

        // peekFirst() : O(1)
        System.out.println("Front element : " + dq.peekFirst());

        // peekLast() : O(1)
        System.out.println("Rear element : " + dq.peekLast());
        
        // Final state of Deque
        System.out.println("Final Deque : " + dq);

        // getFirst() and getLast() : O(1)
        System.out.println("First element using getFirst() : " + dq.getFirst());
        System.out.println("Last element using getLast() : " + dq.getLast());

    }
    
}
