// WAP to reverse the number using Stack.
package Part1;

import java.util.Stack;

public class ReverseStack1 {
    public static void reverseStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }

        // recursive case
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Print stack
    public static void printStack(Stack<Integer> s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.println(s.get(i));
        }
    }

    public static void main(String[] args) { // O(n) time complexity and O(n) space complexity
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        //3, 2, 1
        System.out.println("After reversing the stack:");
        reverseStack(s);
        printStack(s);
        //1, 2, 3
    }

}
