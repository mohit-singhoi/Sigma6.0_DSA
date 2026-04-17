// Qns_03 : Decode a String
// Given an encoded string, return its decoded string. The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer. using Stack.
// Sample input1: 2[cv]
// Sample output1: cvcv
// Sample input2: 3[a2[c]]
// Sample output2: accaccacc

package PracticeQns;

import java.util.Stack;

public class Qns_03 {
    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int index = 0;

        while (index < s.length()) {
            char currentChar = s.charAt(index);

            // If digit → build full number (handles multi-digit like 12[a])
            if (Character.isDigit(currentChar)) {
                int count = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            }

            // If '[' → push current result
            else if (currentChar == '[') {
                stringStack.push(result.toString());
                result.setLength(0);
                index++;
            }

            // If ']' → decode
            else if (currentChar == ']') {
                StringBuilder temp = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();

                for (int i = 0; i < repeatCount; i++) {
                    temp.append(result);
                }

                result = temp;
                index++;
            }

            // If character → add to result
            else {
                result.append(currentChar);
                index++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "2[cv]";
        String input2 = "3[a2[c]]";

        System.out.println(decodeString(input1)); // cvcv
        System.out.println(decodeString(input2)); // accaccacc
    }
}