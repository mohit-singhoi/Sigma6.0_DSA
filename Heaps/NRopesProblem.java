// Connect N Ropes with minimum cost
// Given are N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to the sum of their lengths. We need to connect the ropes with minimum cost.

import java.util.PriorityQueue;
public class NRopesProblem {
    public static void main(String[] args) {
        int[] ropes = { 4, 3, 2, 6 };

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int cost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();

            int combined = first + second;
            cost += combined;

            minHeap.add(combined);
        }
        System.out.println("Minimum cost to connect ropes: " + cost);
    }

}
