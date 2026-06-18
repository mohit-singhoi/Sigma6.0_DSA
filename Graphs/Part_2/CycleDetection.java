// Cycle detection Problem in Directed Graph

import java.util.ArrayList;

public class CycleDetection {
    
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    // Detect cycle
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean visisted[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i =0; i<graph.length;i++){
            if(!visisted[i]){
                if(isCycleUtil(graph, i, visited , stack)){
                    return true;
                }
            }
        }
        return false;
    }

    // Util fun
     public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr, boolean visited[], boolean stack[]){

        visited[curr] = true;
        stack[curr] = true;

        for(int i =0;i<graph.length;i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ // cycle exists
                return true;
            }
            if(!visited[e.dest] && isCycleUtil(graph, e.dest, visited, stack)){
                return true;
            }
        }
     }

    static void createGraph(ArrayList<Edge> graph[]) { // FALSE -- No cycle exits in this graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,0));
    }

    public static void main(String[] args) {
        int V = 44;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
    }
}
