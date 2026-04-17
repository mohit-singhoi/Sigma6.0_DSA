
import java.util.Stack;

// WAP to find the maximum area of a histogram given an array of heights.
public class MaxHistogramArea {
    public static void maxArea(int heights[]){ // O(n) -> Optimized Solution
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // Next Smaller Right : O(n)
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        // Next Smaller Left : O(n)
        stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }


        // Calculate Area  : Width = NSR - NSL - 1 : O(n)
        for (int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println("Maximum Area in Histogram : " + maxArea);
    }

    // Main method to test the function
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        int heights2[] = {2, 4};
        maxArea(heights);   
        maxArea(heights2);
    }
}
