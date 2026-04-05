package Part2;

public class CircularLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add element at last node - O(1)
    public void addLast(int data) {
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circular link
            return;
        }
        tail.next = newNode; // Link
        tail = newNode; // Update tail
        tail.next = head; // circular link
    }

    // Print Circular LL
    public void print() {
        if (head == null) {
            System.out.println("Circular LL is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    // Remove first element - O(1)
    public int removeFirst() {
        if (head == null) {
            System.out.println("Circular LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (head == tail) { // only 1 element
            head = tail = null;
            size--;
            return val;
        }
        head = head.next;
        tail.next = head;
        size--;
        return val;
    }


    // Remove last element - O(n)
    public int removeLast() {
        if (head == null) {
            System.out.println("Circular LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;

        // Case 1: Only one element
        if (head == tail) {
            head = tail = null;
            size--;
            return val;
        }

        // Case 2: More than one element
        Node temp = head;

        // Traverse to second last node
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head; // maintain circular link
        tail = temp; // update tail
        size--;

        return val;
    }

    // Main method
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.print(); // 1->2->3->4->HEAD

        System.out.println("Removed First: " + list.removeFirst()); // 1
        list.print(); // 2->3->4->HEAD

        System.out.println("Removed Last: " + list.removeLast()); // 4
        list.print(); // 2->3->HEAD
    }
}
