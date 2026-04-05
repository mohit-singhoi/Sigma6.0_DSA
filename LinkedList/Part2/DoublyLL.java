package Part2;

public class DoublyLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // AddFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    // Print Doubly LL
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // removeLast
    public int removeLast(){
        if(size == 0){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        // If there is only one node in the list, we need to handle it separately to avoid null pointer exceptions.
        else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // Remove First
    public int removeFirst(){
        if(size == 0){
            System.out.println("Doubly Linked List is empty");
            return Integer.MIN_VALUE;
        }
        // If there is only one node in the list, we need to handle it separately to avoid null pointer exceptions.
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }



    // Main fun
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(8);
        dll.addFirst(7);
        dll.addFirst(1);
        dll.addFirst(6);
        dll.print(); // 6<->1<->7<->8<->null
        System.out.println("Size of the Doubly Linked List: " + size); // Size of the Doubly Linked List: 4
        dll.removeLast();
        dll.print(); // 6<->1<->7<->null
        dll.removeFirst();
        dll.print(); // 1<->7<->null
        System.out.println("Size of the Doubly Linked List: " + size); // Size of the Doubly Linked List: 2
        dll.addLast(133);
        dll.print(); // 1<->7<->133<->null
        System.out.println("dll.size: " + size); // dll.size: 3

    }
    
}
