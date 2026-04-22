// WAP to interleave the first half of the queue with the second half of the queue. If the number of elements in the queue is odd, then the extra element should be considered as part of the first half.
import java.util.*;
public class InterLeaveQueue {
        public static void interLeave(Queue<Integer> q){
            Queue<Integer> firstHalf = new LinkedList<>();
            int size = q.size();
    
            for(int i=0;i<size/2;i++){
                firstHalf.add(q.remove());
            }
    
            while(!firstHalf.isEmpty()){
                q.add(firstHalf.remove());
                q.add(q.remove());
            }
        }
    
        // Main fun
        public static void main(String[] args) {
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.add(7);   
            q.add(8);
            q.add(9);
            q.add(10);
    
            interLeave(q);
            // Print the interleaved queue
            while(!q.isEmpty()){
                System.out.print(q.remove()+" ");
            }
            System.out.println();
        }
    
}
