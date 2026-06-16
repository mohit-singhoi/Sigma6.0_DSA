// Breadth First Search (BFS) implementation for a graph
import java.util.*;

public class CheckPath {

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


    //Check Path between source and destination
    public static boolean checkPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }

        visited[src] = true;
        for(int i = 0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            //e.dest is the neighbor of src
            if(!visited[e.dest]){
                if(checkPath(graph, e.dest, dest, visited)){
                    return true;
                }
            }
        }
        return false;
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
        // int src = 0;
        // int dest = 5;
        // boolean[] visited = new boolean[graph.length];
        // System.out.println("Is there a path from " + src + " to " + dest + "? : " + checkPath(graph, src, dest, visited));

        System.out.println("Is there a path from 0 to 5? : " + checkPath(graph, 0, 5, new boolean[V]));

    
    }
    
}
