// Check if cycle exists in an undirected graph using DFS

import java.util.ArrayList;

public class DetectCycle {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Create Graph
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
     //   graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

      //  graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // Detect Cycle : O(V+E)
    public static boolean detectCycle(ArrayList<Edge>[] graph) {

        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            if (!visited[i]) {

                if (detectCycleUtil(graph, visited, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    // DFS Utility Function
    public static boolean detectCycleUtil(
            ArrayList<Edge>[] graph,
            boolean visited[],
            int curr,
            int parent) {

        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            // Case 1: Neighbor not visited
            if (!visited[e.dest]) {

                if (detectCycleUtil(graph, visited, e.dest, curr)) {
                    return true;
                }
            }

            // Case 2: Neighbor visited and not parent
            else if (e.dest != parent) {
                return true;
            }

            // Case 3: Neighbor is parent
            // Do nothing
        }

        return false;
    }

    public static void main(String[] args) {

        /*
                 0 ----------- 3
               / |             |
             /   |             |
            /    |             |
           1     |             4
            \    |
             \   |
               \ 2

           Cycle: 0 -> 1 -> 2 -> 0
        */

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println("Cycle Exists: " + detectCycle(graph));
    }
}