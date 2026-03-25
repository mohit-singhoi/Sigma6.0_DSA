// Apply LinkedList element remove opration.
// RemoveFirst element
// Remove last element 
public class LinkedList1 {
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

    // removeFirst node
    public int removeFirst() {

        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    // remove lastNode
    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // prev : size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // trail.data
        prev.next = null;
        size--;
        return val;
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

    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList1();
        l1.printData();
        l1.addData(2);
        l1.addData(3);
        l1.addData(9);
        l1.addData(5);
        l1.printData();
        System.out.println("Size of LL is : " + size);
        l1.removeFirst();
        l1.printData();
        System.out.println("After Removing Size of LL is : " + size);
        l1.removeLast();
        l1.printData();
        System.out.println("After Removing Size of LL is : " + size);

    }
}
