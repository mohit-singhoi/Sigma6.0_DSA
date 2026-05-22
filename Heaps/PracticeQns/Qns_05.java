// Qns_05.java : Merged K Sorted  Linked Lists
// We have K linked lists, each of size N, and each list is sorted in non-decreasing order. Merge them into a single sorted (non-decreasing order) linked list and print the sorted linked list as output.

// Sample Input 1:
// K = 3, N = 3
// list1 = 1 -> 3 -> 7 -> NULL
// list2 = 2 -> 4 -> 8 -> NULL
// list3 = 9 -> 10 -> 11 -> NULL

// Sample Output 1:
// 1 -> 2 -> 3 -> 4 -> 7 -> 8 -> 9 -> 10 -> 11 -> NULL


package PracticeQns;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Qns_05 {

    static Node mergeKLists(Node[] lists, int K) {

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a,b) -> a.data - b.data);

        // Add first node of each list
        for(int i=0; i<K; i++) {
            if(lists[i] != null)
                pq.add(lists[i]);
        }

        Node dummy = new Node(0);
        Node tail = dummy;

        while(!pq.isEmpty()) {

            Node curr = pq.poll();

            tail.next = curr;
            tail = tail.next;

            if(curr.next != null)
                pq.add(curr.next);
        }

        return dummy.next;
    }

    static void printList(Node head) {

        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(7);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(8);

        Node list3 = new Node(9);
        list3.next = new Node(10);
        list3.next.next = new Node(11);

        Node[] lists = {list1, list2, list3};

        Node result = mergeKLists(lists, 3);

        System.out.println("Merged linked list:");
        printList(result);
    }
}