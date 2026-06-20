// Topological Sorting is a linear ordering of the vertices in a Directed Acyclic Graph (DAG)
//  such that for every directed edge u → v, vertex u appears before v in the ordering.

import java.util.*;

public class TopologicalSorting {

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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topSortUtil(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // DFS Utility Function
    public static void topSortUtil(ArrayList<Edge>[] graph,
                                   int curr,
                                   boolean[] visited,
                                   Stack<Integer> stack) {

        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visited[e.dest]) {
                topSortUtil(graph, e.dest, visited, stack);
            }
        }

        stack.push(curr);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        topSort(graph);
    }
}