// Search Element (Iterative)
// Search forna key in a LinkedList. Return the position where it is found. if not found, return -1.

public class SearchEleIdx {
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

    // Add element in the linkedList - O(1)
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


    // Main fun
    public static void main(String[] args) {
        SearchEleIdx l1 = new SearchEleIdx();
        LinkedList l2 = new LinkedList();

        l2.printData();
        l1.addData(1);
        l1.addData(8);
        l1.addData(6);
        l1.addData(2);
        l1.addData(40);
        l1.addData(2);
        l2.printData();
        System.out.println("Size of Linked List is : "+size);
    }
}
