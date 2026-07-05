// Bridge in a Graph : It is an edge whose removal increases the number of connected components in the graph.
// In other words, a bridge is an edge that, if removed, would disconnect the graph into two or more separate components.
// Bridges are important in network analysis and graph theory because they represent critical connections that, if disrupted, can lead to the fragmentation of the network.

// Tarjan's algorithm is a well-known algorithm for finding bridges in a graph. It uses depth-first search (DFS) to explore the graph and identify edges that are bridges.

import java.util.ArrayList;

public class BridgeProblem {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

    // 0 - 1
    graph[0].add(new Edge(0, 1));
    graph[1].add(new Edge(1, 0));

    // 0 - 2
    graph[0].add(new Edge(0, 2));
    graph[2].add(new Edge(2, 0));

    // 1 - 2
    graph[1].add(new Edge(1, 2));
    graph[2].add(new Edge(2, 1));

    // 0 - 3
    graph[0].add(new Edge(0, 3));
    graph[3].add(new Edge(3, 0));

    // 3 - 4
    graph[3].add(new Edge(3, 4));
    graph[4].add(new Edge(4, 3));

    // 4 - 5
    graph[4].add(new Edge(4, 5));
    graph[5].add(new Edge(5, 4));

    // 3 - 5
    graph[3].add(new Edge(3, 5));
    graph[5].add(new Edge(5, 3));
    }

    static int time = 0;
    public static void dfs(ArrayList<Edge> graph[], int curr, int par,
            int dt[], int low[], boolean vis[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // e.src --e.dest
            int nbr = e.dest;

            if (nbr == par) {
                continue;
            } else if (!vis[nbr]) {
                dfs(graph, nbr, curr, dt, low, vis);
                low[curr] = Math.min(low[curr], low[nbr]);

                // Check for bridge
                if (dt[curr] < low[nbr]) {
                    System.out.println("Bridge : " + curr + " ---> " + nbr);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[nbr]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge>[] graph, int V) {

        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        createGraph(graph);

        // Call the function to find bridges in the graph
        System.out.println("Bridges in the graph:");
        tarjanBridge(graph, vertices);
    }

}
