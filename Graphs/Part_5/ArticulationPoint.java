// Tarjan's Algorithm finds all articulation points using Depth First Search (DFS).
// An Articulation Point (Cut Vertex) is a vertex in an undirected graph whose removal (along with all its connected edges) increases the number of connected components of the graph.
// If removing a vertex disconnects the graph, then that vertex is called an Articulation Point.

import java.util.ArrayList;

public class ArticulationPoint {

    static int time = 0;

    // Add Edge (Undirected Graph)
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // DFS Utility Function
    static void APUtil(ArrayList<ArrayList<Integer>> adj,
                       int u,
                       boolean[] visited,
                       int[] disc,
                       int[] low,
                       int parent,
                       boolean[] isAP) {

        // Count children of current node
        int children = 0;

        visited[u] = true;

        // Discovery time and Low value
        disc[u] = low[u] = ++time;

        // Traverse all adjacent vertices
        for (int v : adj.get(u)) {

            // If vertex is not visited
            if (!visited[v]) {

                children++;

                APUtil(adj, v, visited, disc, low, u, isAP);

                // Update low value
                low[u] = Math.min(low[u], low[v]);

                // Case 2: Non-root node
                if (parent != -1 && low[v] >= disc[u]) {
                    isAP[u] = true;
                }

            }
            // Back Edge
            else if (v != parent) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        // Case 1: Root node
        if (parent == -1 && children > 1) {
            isAP[u] = true;
        }
    }

    // Function to find Articulation Points
    static void AP(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] isAP = new boolean[V];

        time = 0;

        // DFS for every unvisited vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                APUtil(adj, i, visited, disc, low, -1, isAP);
            }
        }

        // Print Articulation Points
        System.out.print("Articulation Points: ");

        boolean found = false;

        for (int i = 0; i < V; i++) {
            if (isAP[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // ---------------- Graph 1 ----------------

        int V = 5;

        ArrayList<ArrayList<Integer>> graph1 = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph1.add(new ArrayList<>());
        }

        addEdge(graph1, 1, 0);
        addEdge(graph1, 0, 2);
        addEdge(graph1, 2, 1);
        addEdge(graph1, 0, 3);
        addEdge(graph1, 3, 4);

        System.out.println("Graph 1");
        AP(graph1, V);

        // ---------------- Graph 2 ----------------

        V = 4;

        ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph2.add(new ArrayList<>());
        }

        addEdge(graph2, 0, 1);
        addEdge(graph2, 1, 2);
        addEdge(graph2, 2, 3);

        System.out.println("\nGraph 2");
        AP(graph2, V);

        // ---------------- Graph 3 ----------------

        V = 7;

        ArrayList<ArrayList<Integer>> graph3 = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph3.add(new ArrayList<>());
        }

        addEdge(graph3, 0, 1);
        addEdge(graph3, 1, 2);
        addEdge(graph3, 2, 0);
        addEdge(graph3, 1, 3);
        addEdge(graph3, 1, 4);
        addEdge(graph3, 1, 6);
        addEdge(graph3, 3, 5);
        addEdge(graph3, 4, 5);

        System.out.println("\nGraph 3");
        AP(graph3, V);
    }
}