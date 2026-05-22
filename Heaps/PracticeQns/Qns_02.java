// Qns_02.java : Minimum times required to fill given N slots.
// We have an integer N which denotes the number of slots, and an array[] consisting of k integers in the range [1, N] repreand.
// Each  element of the array are in range [1, N] and represents the slot number that can be filled in one operation. We need to find the minimum number of operations required to fill all the N slots.

// Input1 : n = 5, K = 5, arr[] = {1, 2, 3, 4, 5}
// Output : 1
// Explanation : We can fill all the 5 slots in one operation as we have all the

// Input2 : n = 6, K = 2, arr[] = {2,6}
// Output : 2
// Explanation : We can fill slot 2 and 6 in the first operation, and then we can fill the remaining slots in the second operation.

package PracticeQns;

import java.util.*;

public class Qns_02 {

    public static void minTime(int arr[], int N, int K) {

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N + 1];

        int time = 0;

        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }

        while (!q.isEmpty()) {

            int size = q.size();   // Store current level size

            for (int i = 0; i < size; i++) {

                int curr = q.poll();

                // Check the previous slot
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }

                // Check the next slot
                if (curr + 1 <= N && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }

            time++;
        }

        System.out.println(time - 1);
    }

    public static void main(String[] args) {

        int N = 6;
        int arr[] = {2, 6};
        int K = arr.length;

        System.out.print("Minimum time required to fill all slots: ");
        minTime(arr, N, K);
    }
}