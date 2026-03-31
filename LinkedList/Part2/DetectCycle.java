//Detect a Loop/cycle in a Linked List

package Part2;

public class DetectCycle {
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

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; // cycle exists
            }
            
        }
        return false; // cycle doesn't exists
    }

    // Main fun
    public static void main(String[] args) {
       DetectCycle l1 = new DetectCycle();
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
     //  head.next.next.next = head;
       // 1->2->3->1
       System.out.println("Cycle Exists in LinkedList ? : " + l1.isCycle());
    
    }

}
