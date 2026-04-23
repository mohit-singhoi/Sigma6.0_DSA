// Qns 2: Connect n ropes with minimum cost
// Given n ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to the sum of their lengths. We need to connect the ropes with minimum cost.

package PracticeQns;
import java.util.*;
public class Qns_02 {
    public static int minCostToConnectRopes(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of ropes: ");
        int n = sc.nextInt();
        int[] ropes = new int[n];
        System.out.println("Enter the lengths of the ropes:");
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        int result = minCostToConnectRopes(ropes);
        System.out.println("Minimum cost to connect the ropes: " + result);
    }
    
}
