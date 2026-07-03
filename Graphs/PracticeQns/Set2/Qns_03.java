// Qns_03.java
// Find whether it is possible to finish all tasks or not

// There are a total of n tasks you have to pick, labelled from 0 to n − 1.
// Some tasks may have prerequisites; for example, to pick task 0, you have to
// first pick task 1, which is expressed as a pair: [0, 1]

// Given the total number of tasks and a list of prerequisite pairs,
// determine whether it is possible for you to finish all the tasks.

// Sample Input 1: [[1, 0], [0, 1]]
// Sample Output 1: false

// Sample Input 2: [[1, 0], [2, 1], [3, 2]]
// Sample Output 2: true

import java.util.ArrayList;

public class Qns_03 {

    // Create Graph
    static void createGraph(ArrayList<Integer>[] graph, int[][] prerequisites) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int task = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];

            graph[prerequisite].add(task);
        }
    }

    // DFS to detect cycle
    static boolean isCycle(ArrayList<Integer>[] graph, int curr,
                           boolean[] vis, boolean[] stack) {

        vis[curr] = true;
        stack[curr] = true;

        for (int neighbor : graph[curr]) {

            if (stack[neighbor]) {
                return true;
            }

            if (!vis[neighbor]) {
                if (isCycle(graph, neighbor, vis, stack)) {
                    return true;
                }
            }
        }

        stack[curr] = false;
        return false;
    }

    // Check whether all tasks can be finished
    static boolean canFinish(int n, int[][] prerequisites) {

        ArrayList<Integer>[] graph = new ArrayList[n];
        createGraph(graph, prerequisites);

        boolean[] vis = new boolean[n];
        boolean[] stack = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (isCycle(graph, i, vis, stack)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample Input 1
        int n1 = 2;
        int[][] prerequisites1 = {
            {1, 0},
            {0, 1}
        };

        System.out.println("Sample Input 1: " + canFinish(n1, prerequisites1));

        // Sample Input 2
        int n2 = 4;
        int[][] prerequisites2 = {
            {1, 0},
            {2, 1},
            {3, 2}
        };

        System.out.println("Sample Input 2: " + canFinish(n2, prerequisites2));
    }
}