// Qns_04 : Trapping Rain Water
// We have an array of N non-negative integers arr[] representing an elevation an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
// Example 1:
// Input: N = 6, arr[] = {3, 0, 0, 2, 0, 4}
// Output: 10
// Explanation: The structure is like below. So, 10 units of rain water (blue section) are being trapped.
// Example 2:
// Input: N = 3, arr[] = {0, 1, 0}
// Output: 0
// Explanation: No water will be trapped.
// Using Stack.

import java.util.Stack;
public class Qns_04 {
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int totalWater = 0;
        int currentIndex = 0;

        while (currentIndex < height.length) {
            // While stack is not empty and current height is greater than the height at the top of the stack
            while (!stack.isEmpty() && height[currentIndex] > height[stack.peek()]) {
                int top = stack.pop(); // Get the index of the last bar

                if (stack.isEmpty()) {
                    break; // No left boundary
                }

                int distance = currentIndex - stack.peek() - 1; // Calculate distance between the current bar and the new top of the stack
                int boundedHeight = Math.min(height[currentIndex], height[stack.peek()]) - height[top]; // Calculate bounded height
                totalWater += distance * boundedHeight; // Add trapped water
            }
            stack.push(currentIndex); // Push current index to stack
            currentIndex++;
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 0, 2, 0, 4};
        int[] arr2 = {0, 1, 0};
        int [] arr3 = {7,0,4,2,5,0,6,4,0,5};

        System.out.println(trap(arr1)); // Output: 10
        System.out.println(trap(arr2)); // Output: 0
        System.out.println(trap(arr3)); // Output: 25
    }
}

