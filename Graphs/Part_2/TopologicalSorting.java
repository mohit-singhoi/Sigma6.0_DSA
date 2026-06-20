// Topological Sorting is a linear ordering of the vertices in a Directed Acyclic Graph (DAG)
//  such that for every directed edge u → v, vertex u appears before v in the ordering.

import java.util.ArrayList;

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

        graph[2].add(Edge(2,3));

        graph[3].add(Edge(3,1));

        graph[4].add(Edge(4,0));
        graph[4].add(Edge(4,1));

        graph[5].add(Edge(5,0));
        graph[5].add(Edge(5,2));

    }

    public static void topSort(ArrayList<Edge>[] graph){

    }

    public static void main(String[] args) {
        
    }

    
}
