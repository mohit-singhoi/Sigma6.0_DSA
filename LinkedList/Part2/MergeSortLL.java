package Part2;

public class MergeSortLL {
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

    // Add element at 1st node - O(1)
    public void addFirst(int data) {

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

    // Find mid node
    private Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    // merge 2 sorted linked list
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null){
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        // if there are remaining nodes in either list
        if (head1 != null) {
            temp.next = head1;
        } else if (head2 != null) {
            temp.next = head2;
        }

        return mergedLL.next; // return the merged list without the dummy node
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // step 1 : find mid node
        Node mid = midNode(head);

        // step 2 : divide linked list into 2 halves
        Node rightHead = mid.next;
        mid.next = null; // break the linked list

        // step 3 : sort both halves recursively
        Node newLeftHead = mergeSort(head);
        Node newRightHead = mergeSort(rightHead);

        // step 4 : merge both sorted halves
        return merge(newLeftHead, newRightHead);
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

    // Main method to test the merge sort
    public static void main(String[] args) { // O(n log n)
        MergeSortLL list = new MergeSortLL();
       
        list.addFirst(38);
        list.addFirst(27);
        list.addFirst(43);
        list.addFirst(3);
       // list.addFirst(9); // add 9 at the beginning
        System.out.println("Original List: ");
        list.printData(); // Original List: [43, 38, 9, 27, 3]

        list.head = list.mergeSort(list.head);
        System.out.println("Sorted List: ");
        list.printData(); // Sorted List: [3, 9, 27, 38, 43]
    }

}
