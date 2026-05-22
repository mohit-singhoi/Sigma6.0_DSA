// Sliding Window Maximum problem/ Maximum of all subarrays of size k
// Given an array of integers and a number k, find the maximum sum of a subarray of size k.
// Input : arr[] = {1, 2, 3, 4, 5,6,7,8,9,10}, k = 3
// Output : 3 4 5 6 7 8 9 10
// Explanation : Maximum of first 3 elements is 3, maximum of next 3 elements

import java.util.*;
public class SlidingWindowMax {
    static class pair implements Comparable<pair> {
        int value;
        int index;

        pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(pair p2) {
            // Ascednding
           // return this.value - p2.value; // Sort in ascending order based on value
            // Descending
            return p2.value - this.value; // Sort in descending order based on value
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;

        PriorityQueue<pair> pq = new PriorityQueue<>();

        // 1st Window: 1, 2, 3 -> Max = 3
        // 2nd Window: 2, 3, 4 -> Max = 4
        // 3rd Window: 3, 4, 5 -> Max = 5
        // 4th Window: 4, 5, 6 -> Max = 6
        // 5th Window: 5, 6, 7 -> Max = 7
        // 6th Window: 6, 7, 8 -> Max = 8
        // 7th Window: 7, 8, 9 -> Max = 9
        // 8th Window: 8, 9, 10 -> Max = 10
        

        for (int i = 0; i < arr.length; i++) {
            // Add current element and its index to the priority queue
            pq.add(new pair(arr[i], i));

            // Remove elements that are out of the current window
            while (!pq.isEmpty() && pq.peek().index <= i - k) {
                pq.poll();
            }

            // If we have processed at least k elements, print the maximum of the current window
            if (i >= k - 1) {
                System.out.print(pq.peek().value + " ");
            }
        }
    }
    
}
