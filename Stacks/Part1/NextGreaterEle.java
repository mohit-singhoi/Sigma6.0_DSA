// the Next Greater Element for an element x is the first greater element on the right side of x in array. If it does not exist, then the next greater element for x is -1. For example, for an array, the next greater element for 4 is 5, for 5 is -1.

package Part1;
import java.util.*;


public class NextGreaterEle {
    public static void nextGreater(int[] arr, int[] nxtgre){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        nxtgre[0] = -1;

        // next greater right -> traverse from right to left
        // next greater left as well as next smaller left -> traverse from left to right like o to n
        for (int i = arr.length - 1; i >= 0; i--){
            int currEle = arr[i];
            // 1. While
            // Next Greater Right -> currEle > arr[s.peek()]
            // Next Smaller Right -> currEle < arr[s.peek()]
            // 
            while (!s.isEmpty() && currEle > arr[s.peek()]){

                s.pop();
            }

            // 2. If-else
            if (s.isEmpty()){
                nxtgre[i] = -1;
            } else {
                int nextGreater = s.peek();
                nxtgre[i] = arr[nextGreater];
            }

            // 3. Push
            s.push(i);

        }
    }

    // Main Method
    public static void main(String[] args) { // O(n) time complexity and O(n) space complexity
        int arr[] = {4, 5, 2, 10, 8};
        int nxtgre[] = new int[arr.length];
        nextGreater(arr, nxtgre);
        System.out.println("Next Greater Element for each element in the array:");
        for (int i = 0; i < nxtgre.length; i++){
            System.out.print(nxtgre[i] + " ");
        }
    }
 
}


// 1. Next Greater Right 
// 2. Next Greater Left
// 3. Next Smaller Right
// 4. Next Smaller Left