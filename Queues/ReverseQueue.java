// WAP to reverse a queue using Stack.
import java.util.*;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Step 1 : Push all elements of queue into stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Step 2 : Pop all elements from stack and add back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    // Main method
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // Print the reversed queue
        System.out.print("Reversed Queue : ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
    
}
