// Breadth First Search (BFS) implementation for a graph
import java.util.*;

public class DFSGraph {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }



    // Create a graph using an adjacency list representation
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    }

    // DFS traversal of the graph
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){ // O(V + E)
        // Visisit
        System.out.print(curr + " ");
        // Mark the current vertex as visited
        visited[curr] = true;

        // Explore the neighbors of the current vertex
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){ // Check if the neighbor vertex has not been visited
                dfs(graph, e.dest, visited); // Recursively visit the neighbor vertex
            }
        }

    }

    // Main method to perform DFS traversal
    public static void main(String[] args) {

        /*
               1 -------3
              /         \
            0            5 ------- 6
              \         /
               2 -------4
        
        */

        int V = 7; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("DFS Traversal of the graph: ");
        boolean[] visited = new boolean[graph.length];
        dfs(graph, 0, visited);
    }
    
}
