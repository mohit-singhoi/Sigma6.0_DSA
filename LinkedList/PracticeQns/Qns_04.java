// Odd Even Linked List
// Given a singly linked list of integers, Write a function to modify the linked list in such that all even numbers appears before all the odd numbers in the modified linked list.
// Also keep the order of even and odd numbers same. 

// Sample Input 1: 8->12->10->5->4->1->6->NULL
// Sample Output 1: 8->12->10->4->6->5->1->NULL

// Sample Input 2: 1->3->5->7->NULL
// Sample Output 2:1->3->5->7->NULL
package PracticeQns;

public class Qns_04 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public Node oddEvenList(Node head) {
        if (head == null) {
            return null; // Empty list
        }

        Node odd = head; // Pointer for odd nodes
        Node even = head.next; // Pointer for even nodes
        Node evenHead = even; // To keep track of the head of even nodes

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd nodes together
            odd = odd.next; // Move odd pointer

            even.next = odd.next; // Link even nodes together
            even = even.next; // Move even pointer
        }

        odd.next = evenHead; // Connect the end of odd list to the head of even list

        return head; // Return the modified list
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Qns_04 list = new Qns_04();
        list.push(6);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(8);   

        System.out.println("Original List:");
        list.printList(list.head);

        list.head = list.oddEvenList(list.head);
        System.out.println("Modified List:");
        list.printList(list.head);
    }
    
}
