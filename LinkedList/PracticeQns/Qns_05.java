// Merge K Sorted Linked Lists
// Given an array of K linked lists, each linked list is sorted in ascending order. Merge

// Sample Input 1:k = 2, n =  2
// l1 = 1->3->NULL
// l2 = 6->8->NULL
// l3 = 9->10->NULL
// Sample Output 1: 1->3->6->8->9->10->NULL


package PracticeQns;

import java.util.PriorityQueue;

class Qns_05 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node mergeKLists(Node[] lists) {

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> a.data - b.data
        );

        // Add first node of each list
        for (Node head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node minNode = pq.poll();
            tail.next = minNode;
            tail = tail.next;

            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }

    // Print function
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Qns_05 obj = new Qns_05();

        // Create lists
        Node l1 = new Node(1);
        l1.next = new Node(3);

        Node l2 = new Node(6);
        l2.next = new Node(8);

        Node l3 = new Node(9);
        l3.next = new Node(10);

        Node[] lists = {l1, l2, l3};

        Node result = obj.mergeKLists(lists);

        obj.printList(result);
    }
}
