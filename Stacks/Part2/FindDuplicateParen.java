// Find Duplicate Parenthesis in an expression
import java.util.*;
public class FindDuplicateParen {
    public static boolean findDuplicate(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if closing paren is found, check for duplicate
            if (c == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } 
            // if opening paren or any other character is found, push to stack
            else {
                stack.push(c);
            }
        }
        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String s1 = "((a+b))"; // true
        String s2 = "(a+(b)/c)"; // false
        String s3 = "(a+b*(c-d))"; // false
        String s4 = "((a+b)+(c-d))"; // false   
        String s5 = "(((a+b)))"; // true
        System.out.println(findDuplicate(s1));
        System.out.println(findDuplicate(s2));
        System.out.println(findDuplicate(s3));
        System.out.println(findDuplicate(s4));
        System.out.println(findDuplicate(s5));
    }
}
