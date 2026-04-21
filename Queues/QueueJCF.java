// Implementation of Queue using Java Collections Framework (JCF)

import java.util.*;
public class QueueJCF {
    public static void main(String[] args) { // O(1)
       // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); // 1
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3
    }
}
