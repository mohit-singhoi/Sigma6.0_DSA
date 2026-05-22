// Qns_04.java : Minimum Operations to Halve Array Sum
//  We have an array `Arr[]`. The task is to find the minimum number of operations required to make the sum of the array elements less than or equal to half of its initial value. In one operation, it is allowed to halve the value of any array element.

// Input: Arr[] = {1,5,8,19}
// Output: 3


package PracticeQns;

import java.util.*;
public class Qns_04 {
    public static int minOperations(int[] arr) {

        // Calculate initial sum
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double target = sum / 2;
        int operations = 0;

        // Use a max-heap to always halve the largest element
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add((double) num);
        }

        while (sum > target) {
            double largest = maxHeap.poll();
            double halved = largest / 2;
            sum -= halved; // Reduce the sum by the halved value
            maxHeap.add(halved); // Add the halved value back to the heap
            operations++;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 19};
        System.out.println("Minimum operations to halve array sum: " + minOperations(arr));
    }
    
}
