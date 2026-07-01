//Kruskals Algorithm

import java.util.*;

public class KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }

        @Override
        public int compareTo(Edge e) {
            return this.wt - e.wt;
        }
    }

    static int parent[];
    static int rank[];

    // Initialize DSU
    static void init(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    // Find with Path Compression
    static int find(int x) {
        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    // Union by Rank
    static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else {
            parent[parB] = parA;
        }
    }

    static void kruskal(ArrayList<Edge> edges, int V) {

        Collections.sort(edges);

        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1 && i < edges.size(); i++) {

            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }

        System.out.println("Minimum Cost of the Spanning Tree is = " + mstCost);
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));

        init(V);

        kruskal(edges, V);
    }
}