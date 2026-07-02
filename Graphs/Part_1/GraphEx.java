import java.util.*;

public class GraphEx {

    static class Graph {
        int V;
        ArrayList<ArrayList<Integer>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Add Edge
        void addEdge(int src, int dest) {
            adj.get(src).add(dest);
            adj.get(dest).add(src); // Undirected Graph
        }

        // Print Graph
        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print(i + " -> ");

                for (int neighbor : adj.get(i)) {
                    System.out.print(neighbor + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);

        g.printGraph();
    }
}