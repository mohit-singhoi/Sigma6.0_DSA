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
    }
    
}
