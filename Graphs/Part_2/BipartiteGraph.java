// Bipartite Graph Problem
// A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge (u,v) either connects a vertex from U to V.
// In other words, for every edge(u,v), either u belongs to U ans v belongs to V or u belongs to V and v belongs to U. We can also say that there is no edge that connects vertices of same set.

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BipartiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
  

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        //graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        //graph[4].add(new Edge(4, 3));
    }


    // O(V+E)
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int [graph.length];
        for(int i = 0;i<col.length;i++){
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<graph.length;i++){
            if(col[i] ==  -1){ // BFS
                q.add(i);
                col[i] = 0; // yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0; j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j); // e.dest
                        if(col[e.dest] == -1){
                            int nextColor = col[curr] == 0 ? 1 :0;
                            col[e.dest] = nextColor;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]){
                            return false; // NOT Bipartite
                        }
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
                0 -------2
               /        /
              /        /
             1        4
              \      /
               \    /
                  3
                FALSE
               
        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.print("Is Bipartite Graph ? : " + isBipartite(graph));
    }

}
