package Part1;
// WAP to check Linkedlist is pallindrom eor Not using Slow fast approach.
public class CheckPallindrome {
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

    // Finding Mid Node
    // Slow fast approach
    public Node findMid(Node head){ // helper fun
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // slow is my midNode
    }

    public boolean checkPallindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);


        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev; // Right half head 
        Node left = head;
        
        
        // step3 - check  left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Main fun
    public static void main(String[] args) {
        CheckPallindrome p1 = new CheckPallindrome();
        p1.addLast(1);
        p1.addLast(2);
       // p1.addLast(2);
        p1.addLast(1);
       // p1.addLast(9);
        p1.printData();
        System.out.println("Size of LinkedList is : " +size);
        System.out.print("check LL is Pallindrom ? : "+p1.checkPallindrome());

    }

}
