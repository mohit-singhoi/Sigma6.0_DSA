// Delete N Node After M Node of a Linked List
// Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.

// Sample Input 1: M=2 N=2    LL: 1->2->3->4->5->6->7->8
// Sample Output 1: 1->2->5->6
// Sample Input 2: M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
// Sample Output 2: 1->2->3->6->7->8

package PracticeQns;

public class Qns_02 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node deleteNNodesAfterMNodes(Node head, int M, int N) {
        if (head == null || M <= 0) {
            return head; // No nodes to retain
        }

        Node current = head;

        while (current != null) {
            // Retain M nodes
            for (int i = 1; i < M && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                break; // Reached the end of the list
            }

            // Delete N nodes
            Node temp = current.next;
            for (int j = 0; j < N && temp != null; j++) {
                temp = temp.next;
            }

            // Link the retained part to the remaining part
            current.next = temp;
            current = temp; // Move to the next segment
        }

        return head;
    }

    public static void main(String[] args) { // TC: O(n) SC: O(1)
        Qns_02 list = new Qns_02();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int M = 2, N = 2;
        head = list.deleteNNodesAfterMNodes(head, M, N);

        // Print the modified linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
}
