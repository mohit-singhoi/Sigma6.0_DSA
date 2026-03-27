// Reversed Linked List in using iterative  approach
public class ReversedLL {
    class Node {
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

    // Add element in the in 1st Node in linkedList - O(1)
    public void addData(int data) {

        // Step 1 = create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 newNode next = head
        newNode.next = head; // Link

        // Step 3 - head = newNode
        head = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    // print the linked list - O(n)
    public void printData() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main fun
    public static void main(String[] args) {
        ReversedLL l1 = new ReversedLL();
        l1.printData();
        l1.addData(1);
        l1.addData(8);
        l1.addData(6);
        l1.addData(2);
        l1.addData(40);
        l1.addData(2);
        l1.addData(2);

        l1.printData();

        System.out.println("\nReversed Linked List.");
        l1.reverse();
        l1.printData();

    }
}
