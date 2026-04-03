package Part2;

public class Zig_ZagLL {
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

    // Methods
    // Add element at last node -O(1)
    public void addLast(int data) {
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void zigZag() {
        Node head = Zig_ZagLL.head;
        if (head == null || head.next == null) {
            return;
        }

        //1. find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; // mid node

        //2. reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        //3. merge 2 halves
        Node left = head, right = prev;

        while (left != null && right != null) {
            Node leftNext = left.next;
            left.next = right;
            left = leftNext;

            Node rightNext = right.next;
            right.next = left;
            right = rightNext;
        }

        
    }
    // print the linked list - O(n)
    public void printData() {
        if (head == null) {
            System.out.println("LinkedList is Empty");      
            return;
        }else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }


    // Main method to test the zig-zag rearrangement
    public static void main(String[] args) {
        Zig_ZagLL list = new Zig_ZagLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);    
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println("Original List: ");
        list.printData(); // Original List: 1->2->3->4->5

        list.zigZag();
        System.out.println("Zig-Zag List: ");
        list.printData(); // Zig-Zag List: 1->6->2->5->3->4
    }


    
}
