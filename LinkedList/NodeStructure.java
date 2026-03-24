// Structure of LinkedList

import java.util.LinkedList;

public class NodeStructure {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    // Methods
    // Add element at 1st node
    public void addFirst(int data){
        // Step 1 =  create new Node
         Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 newNode next = head
        newNode.next = head; // Link

        // Step 3 - head = newNode
        head = newNode;
    }

    // Ad element at last node
    public void addLast(int data){
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 
        tail.next = newNode;

        // Step 3
        tail = newNode;

    }

    // print the linked list 
    public void printData(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){

            System.out.println(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Main Fun
    public static void main(String[] args) {
        LinkedList<Object> l1 = new LinkedList<>();
        l1.printData();
        l1.addFirst(2);
        l1.printData();
        l1.addFirst(1);
        l1.printData();
        l1.addLast(3);
        l1.printData();
        l1.addLast(4);

        
    }
}
