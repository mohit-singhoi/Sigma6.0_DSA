// implement Queue using Deque
import java.util.*;

public class QDeque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int x) {
            deque.addLast(x);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.peekFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    // Main Function
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek : " + q.peek()); // Output: 1
        System.out.println(q.remove()); // Output: 1
        System.out.println(q.remove()); // Output: 2
        System.out.println(q.remove()); // Output: 3
        System.out.println(q.isEmpty()); // Output: true
    }
}