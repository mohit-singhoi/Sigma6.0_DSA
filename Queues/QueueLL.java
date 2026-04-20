// Queue implementation using Linked List in Java
public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;
        int size;

        Queue() {
            front = null;
            rear = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        // add : O(1)
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        // remove : O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int frontData = front.data;
            front = front.next;
            size--;
            if (isEmpty()) {
                rear = null; // If the queue becomes empty, set rear to null
            }
            return frontData;
        }

        // Peek : O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
    }

    // Main Method
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Size of the queue: " + q.size);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
