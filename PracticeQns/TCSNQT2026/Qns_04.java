// You are given N batteries, each having a certain capacity.
// A device requires exactly K batteries to run at any given time. You can replace batteries at any moment, and there is no loss of energy during swapping.
// Your task is to determine the maximum amount of time the device can run continuously.

// Input Format
//First line contains an integer N — number of batteries
//Second line contains N space-separated integers — capacities of batteries
//Third line contains an integer K — number of batteries required to run the device

//Output Format
//Print a single integer — maximum running time

import java.util.Scanner;

public class Qns_04 {

    public static boolean isPossible(long time, long[] batteries, int K) {
        long totalCapacity = 0;

        for (long capacity : batteries) {
            totalCapacity += Math.min(capacity, time);
        }

        return totalCapacity >= time * K;
    }

    public static long maxRunningTime(long[] batteries, int K) {
        long left = 0, right = 0;

        for (long capacity : batteries) {
            right += capacity;
        }

        right /= K;

        while (left < right) {
            long mid = left + (right - left + 1) / 2;

            if (isPossible(mid, batteries, K)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter number of batteries:");
        int n = sc.nextInt();
        long[] batteries = new long[n];

        System.out.print("Enter the capacities of the batteries\n");
        for (int i = 0; i < n; i++) {
            batteries[i] = sc.nextLong();
        }
        System.out.println("Enter number of batteries required to run the device");
        int k = sc.nextInt();

        System.out.println("Total Maximum Running Time: " +  maxRunningTime(batteries, k));

        sc.close();
    }
}