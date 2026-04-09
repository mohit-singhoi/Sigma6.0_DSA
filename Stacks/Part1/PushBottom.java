package Part1;
import java.util.*;
public class PushBottom {
    public static  void pushAtBottom(Stack<Integer> s, int data){
        // base case
        if (s.isEmpty()){
            s.push(data);
            return;
        }

        // recursive case
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) { //O(n) time complexity and O(n) space complexity
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 8);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
