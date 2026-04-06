// We have a likedlist and two kit in it, swap nodes for two given keys. The nodes should be swapped by changing links. Swapping data of nodes may be expensive in many cases when data contains many fields. 
// It may be assumed that all keys in the linked list are distinct.

// Sample Input 1: 1->2->3->4,  x = 2, y = 4
// Sample Output 1: 1->4->3->2

package PracticeQns;

public class Qns_03 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node swapNodes(Node head, int x, int y) {
        if (x == y) {
            return head; // No need to swap if both keys are the same
        }

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, do nothing
        if (currX == null || currY == null) {
            return head;
        }

        // If x is not head of linked list
        if (prevX != null) {
            prevX.next = currY;
        } else { // make y the new head
            head = currY;
        }

        // If y is not head of linked list
        if (prevY != null) {
            prevY.next = currX;
        } else { // make x the new head
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head; // Return the new head of the linked list
    }

    public static void main(String[] args) {
        Qns_03 list = new Qns_03();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int x = 2, y = 4;
        head = list.swapNodes(head, x, y);

        // Print the modified linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
}
