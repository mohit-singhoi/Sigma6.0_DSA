package Part1;

public class stackB {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static Node head = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head; // link new node to old head
            head = newNode; // update head
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    // Main method
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }

    }

}
