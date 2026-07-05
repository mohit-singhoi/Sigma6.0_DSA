// Articulation Point : A vertex in an undirected connected graph whose removal increases the number of connected components in the graph.

import java.util.ArrayList;

public class Articulationpoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

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

        // 4 - 3
        graph[4].add(new Edge(4, 3));

    }

    static int time = 0;

    // O(V+E)
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int dt[], int low[], boolean vis[], boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i); // e.src --e.dest
            int nbr = e.dest;

            if (nbr == par) {
                continue;
            } else if (!vis[nbr]) {
                dfs(graph, nbr, curr, dt, low, vis, ap);
                low[curr] = Math.min(low[curr], low[nbr]);

                // check articulation point
                if (dt[curr] <= low[nbr] && par != -1) {
                    ap[curr] = true;
                }
                child++;
            } else { // back edge
                low[curr] = Math.min(low[curr], dt[nbr]);
            }
        }

        if (par == -1 && child > 1) {
            ap[curr] = true;
        }
    }

    public static void getArticulationPoint(ArrayList<Edge>[] graph, int V) {

        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];
        int dt[] = new int[V];
        int low[] = new int[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, ap);
            }
        }

        System.out.println("Articulation Points:");

        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        getArticulationPoint(graph, V);
    }

}
