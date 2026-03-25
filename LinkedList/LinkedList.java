// Structure of LinkedList

public class LinkedList  {
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
    public static int size;


    // Methods
    // Add element at 1st node - O(1)
    public void addFirst(int data){

        // Step 1 =  create new Node
         Node newNode = new Node(data);
         size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 newNode next = head
        newNode.next = head; // Link

        // Step 3 - head = newNode
        head = newNode;
    }

    // Add element at last node -O(1)
    public void addLast(int data){
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 
        tail.next = newNode;

        // Step 3
        tail = newNode;

    }

    // print the linked list  - O(n)
    public void printData(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){

            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Add at Specified idx
    public void addidx(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // i = idx-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    } 


    // Main Fun
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.printData();
        l1.addFirst(2);
        l1.printData();
        l1.addFirst(1);
        l1.printData();
        l1.addLast(3);
        l1.printData();
        l1.addLast(4);
        l1.printData();
        l1.addidx(2, 9);
        l1.printData();
        l1.addidx(0, 13);
        l1.printData();
        System.out.println("Size of a LinkedList : "+size);
    }

}
