package Part2;
import java.util.LinkedList;
public class LLOp {
    public static void main(String[] args) {
        // Create 
        LinkedList <Integer> list = new LinkedList<>();

        // Add
        list.add(11);
        list.addFirst(7);
        list.addFirst(3);
        list.addLast(70);
        
        // Print list
        //3->7->11->70
        System.out.println("List : "+list);

        // remove
        list.remove();
        list.remove(2);
        list.removeFirst();
      //  list.removeLast();
        System.out.println(list);
        
    }
    
}
