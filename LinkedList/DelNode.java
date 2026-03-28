// Find and remove nth Node from End using iterative approach.
public class DelNode {
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

    public void deleteNthFromEnd(int n){
        // Calculate LL Size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // remove first
            size--;
            return;
        }

        //sz-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
        return;

    }

    // Main fun
    public static void main(String[] args) {
        DelNode n1 = new DelNode();
        n1.addFirst(8);
        n1.addFirst(9);
        n1.addFirst(4);
        n1.addFirst(1);
        n1.addFirst(0);
        n1.addFirst(7);
        n1.printData();
        System.out.println("Size of LL  : "+ size);

        // Remove element 9
        n1.deleteNthFromEnd(3);
        System.out.println("Delete 3rd Node form End");
        n1.printData();
        System.out.println(" After deletion LL Size is : " + size);
    }

}
