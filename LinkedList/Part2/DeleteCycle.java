
// WAP of delete the cycle/loop in detecting in a LinkedList.

package Part2;

public class DeleteCycle {
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

        // Step 2
        tail.next = newNode;

        // Step 3
        tail = newNode;

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

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }

        }
        return false; // cycle doesn't exists
    }

    public static void removeCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // Find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // last node
        // remove cycle -> last.next = null
        prev.next = null; // remove cycle
    }

    // Main function
    public static void main(String[] args) {
     // DeleteCycle l1 = new DeleteCycle();
        head = new Node(1);
        Node temp = new Node(2);
        head .next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2
        System.out.println("Cycle Exists in LinkedList ? : " + DeleteCycle.isCycle());
        DeleteCycle.removeCycle();
        System.out.println("Cycle Exists in LinkedList ? : " + DeleteCycle.isCycle());
        
    }

}
