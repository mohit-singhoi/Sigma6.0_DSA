// Qns_02 
// Java program to detect cycle in a graph using Union-Find

import java.util.ArrayList;

public class Qns_02 {

    static class Edge {
        int src, dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    static int[] parent;

    // Find operation
    static int find(int x) {
        if (parent[x] == -1)
            return x;

        return find(parent[x]);
    }

    // Union operation
    static void union(int x, int y) {
        int xSet = find(x);
        int ySet = find(y);

        if (xSet != ySet) {
            parent[xSet] = ySet;
        }
    }

    // Check Cycle
    static boolean isCycle(ArrayList<Edge> edges, int V) {

        parent = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = -1;
        }

        for (Edge e : edges) {

            int x = find(e.src);
            int y = find(e.dest);

            if (x == y)
                return true;

            union(x, y);
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 10;

        ArrayList<Edge> edges = new ArrayList<>();

        // Graph from the image
        edges.add(new Edge(9, 5));
        edges.add(new Edge(9, 1));
        edges.add(new Edge(1, 5));
        edges.add(new Edge(5, 2));
        edges.add(new Edge(2, 7));

        if (isCycle(edges, V))
            System.out.println("Cycle Exists");
        else
            System.out.println("No Cycle Exists");
    }
}