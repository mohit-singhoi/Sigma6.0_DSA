package Part1;
import java.util.ArrayList;

public class StackA {
    public static class Stack{
        ArrayList<Integer> list = new ArrayList<Integer>();

        //isEmpty
        public boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public void push(int data){
            list.add(data);
        }

        // pop
        public int pop(){
            // check if stack is empty
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek(){
            // check if stack is empty
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    // main method
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
