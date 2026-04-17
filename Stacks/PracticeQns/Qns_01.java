// Qns_01 :Palindrome LinkedList
// We have a singly lnked list of characters. then write a function that returns true if the given list is a palindrome, else false using Stack.
// A->B->C->B->A : true
// A->B->C->D : false
package PracticeQns;

import java.util.*;

public class Qns_01 {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // Push all characters of the linked list to the stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Check if the linked list is a palindrome
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false; // Not a palindrome
            }
            temp = temp.next;
        }
        return true; // Is a palindrome
    }

    // Main method to test the function
    public static void main(String[] args) { // O(n) time complexity and O(n) space complexity
        Node head1 = new Node('A');
        head1.next = new Node('B');
        head1.next.next = new Node('C');
        head1.next.next.next = new Node('B');
        head1.next.next.next.next = new Node('A');

        Node head2 = new Node('A');
        head2.next = new Node('B');
        head2.next.next = new Node('C');
        head2.next.next.next = new Node('D');

        System.out.println(isPalindrome(head1)); // true
        System.out.println(isPalindrome(head2)); // false
    }
    
    
}
