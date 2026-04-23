// Implement Stack using Deque.
import java.util.*;
public class SDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int x) {
            deque.addLast(x);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int top() {
            return deque.peekLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    // Main Function
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek :"+ s.top()); // Output: 3

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
        // System.out.println(s.pop()); // Output: 3
        // System.out.println(s.pop()); // Output: 2
        // System.out.println(s.pop()); // Output: 1
        System.out.println(s.isEmpty()); // Output: true
    }
    
}
