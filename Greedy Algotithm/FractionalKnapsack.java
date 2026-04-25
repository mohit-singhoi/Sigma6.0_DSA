// This is a Java implementation of the Fractional Knapsack problem using a greedy approach.

import java.util.*;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int[] weights = { 10, 20, 30 };
        int[] values = { 60, 100, 120 };
        int capacity = 50;

        double ratio[][] = new double[values.length][2];
        // 0th col => idx, 1st col => ratio
        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) values[i] / weights[i];
        }

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double totalValue = 0.0;
        int remainingCapacity = capacity;

        for (int i =ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (weights[index] <= remainingCapacity) {
                totalValue += values[index];
                remainingCapacity -= weights[index];
            } else {
                totalValue += ratio[i][1] * remainingCapacity;
                break;
            }
        }

        System.out.println("Maximum value in Knapsack = " + totalValue);
    }

}
