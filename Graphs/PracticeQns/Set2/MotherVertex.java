// We have a Directed Graph, find a Mother Vertex in the Graph (if present).
// A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.

import java.util.ArrayList;

public class MotherVertex {

    // Function to add an edge
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }

    // DFS Traversal
    static void DFS(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited) {

        visited[v] = true;

        for (int neighbour : graph.get(v)) {
            if (!visited[neighbour]) {
                DFS(graph, neighbour, visited);
            }
        }
    }

    // Function to find Mother Vertex
    static int findMotherVertex(ArrayList<ArrayList<Integer>> graph, int V) {

        boolean[] visited = new boolean[V];
        int mother = -1;

        // Find the last finished vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(graph, i, visited);
                mother = i;
            }
        }

        // Check whether it is actually a Mother Vertex
        visited = new boolean[V];
        DFS(graph, mother, visited);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1;
            }
        }

        return mother;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Graph from the question
        addEdge(graph, 0, 2);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 0);
        addEdge(graph, 2, 1);
        addEdge(graph, 3, 4);

        int mother = findMotherVertex(graph, V);

        if (mother == -1)
            System.out.println("No Mother Vertex");
        else
            System.out.println("Mother Vertex is : " + mother);
    }
}