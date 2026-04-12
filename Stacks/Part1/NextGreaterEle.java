// the Next Greater Element for an element x is the first greater element on the right side of x in array. If it does not exist, then the next greater element for x is -1. For example, for an array, the next greater element for 4 is 5, for 5 is -1.

package Part1;
import java.util.*;

public class NextGreaterEle {
    public static void nextGreater(int[] arr, int[] nge){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        nge[0] = -1;

        for (int i = arr.length - 1; i >= 0; i--){
            int currEle = arr[i];
            // 1. While
            while (!s.isEmpty() && currEle > arr[s.peek()]){
                s.pop();
            }
            // 2. If-else
            if (s.isEmpty()){
                nge[i] = -1;
            } else {
                int nextGreater = s.peek();
                nge[i] = arr[nextGreater];
            }

            // 3. Push
            s.push(i);

        }
    }

    // Main Method
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        int nge[] = new int[arr.length];
        nextGreater(arr, nge);
        System.out.println("Next Greater Element for each element in the array:");
        for (int i = 0; i < nge.length; i++){
            System.out.print(nge[i] + " ");
        }
    }
 
}
