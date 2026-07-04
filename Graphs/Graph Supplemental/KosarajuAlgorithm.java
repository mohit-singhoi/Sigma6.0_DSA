// Strongly Connected Components (SCC) in a directed graph are subsets of vertices such that every vertex is reachable from every other vertex in the same subset. Kosaraju's algorithm is an efficient method to find all strongly connected components in a directed graph.

// Kosaraju's' algorithm : it is used to find strongly connected components in a directed graph. It works in two main steps: first, it performs a depth-first search (DFS) on the original graph to determine the finishing times of each vertex. Then, it transposes the graph (reverses the direction of all edges) and performs DFS again in the order of decreasing finishing times to identify strongly connected components.
// Steps:
// 1. Perform a DFS on the original graph and store the vertices in a stack according to their finishing times.
// 2. Transpose the graph (reverse the direction of all edges).
// 3. Perform DFS on the transposed graph in the order defined by the stack to
//    find strongly connected components.

import java.util.*;

public class KosarajuAlgorithm {
    static class Edge{
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> s) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!visited[edge.dest]) {
                topSortUtil(graph, edge.dest, visited, s);
            }
        }

        s.add(curr);
    }


    //dfs
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited);
            }
        }
    }


    // Kosaraju's algorithm
    public static void  kosaraju(ArrayList<Edge>[] graph, int V) { // O(V + E)
        
        // Step 1: 
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topSortUtil(graph, i, visited, stack);
            }
        }

        // Step 2: Transpose the graph
        ArrayList<Edge> transposedGraph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false; // Reset visited array for the second DFS
            transposedGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
          //  for (Edge edge : graph[i]) {
          for(int j = 0; j < graph[i].size(); j++) {
                Edge edge = graph[i].get(j); // e.src -> e.dest
                transposedGraph[edge.dest].add(new Edge(edge.dest, edge.src)); // Reverse the direction of the edge
            }
        }

        // Step 3: Perform DFS on the transposed graph in the order defined by the stack
        System.out.println("Strongly Connected Components:");
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr]) {
                dfs(transposedGraph, curr, visited);
                System.out.println(); // Print a new line after each strongly connected component   
            }
        }


    }

    public static void main(String[] args){
        int V = 5; // Number of vertices in the graph
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);
    }
    
}
