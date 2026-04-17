// Qns_05 : Next Greater Element
// Given an array, print the Next Greater Element (NGE) for every element. The Next Greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1.
// Example 1:
// Input: N = 4, arr[] = {1, 3, 2, 4}
// Output: 3 4 4 -1
// Explanation: Next greater element for 1 is 3, for 3 is 4

import java.util.Stack;
public class Qns_05 {
    public static int [] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }   

    // 

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4};
        int[] arr2 = {4, 5, 2, 10, 8};
        int[] result1 = nextGreaterElement(arr1);
        int[] result2 = nextGreaterElement(arr2);

        System.out.println("Array 1:");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }
}
