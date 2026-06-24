// Bellman Ford Algorithm

import java.util.ArrayList;

public class BellmanFordAlgo {

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

    // Create Graph 1
    static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));
    }

    // Create Graph 2
    static void createGraph(ArrayList<Edge> graph) {


        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));

        graph.add(new Edge(1,2,-4));

        graph.add(new Edge(2,3,2));

        graph.add(new Edge(3,4,4));
    }


    public static void bellmanFord(ArrayList<Edge> graph[], int src){

        int dist[] = new int[graph.length];

        for(int i = 0; i < dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        //O(v*E)


        //algo - O(v)
        // Bellman Ford runs V-1 times
        for(int i = 0; i < V-1; i++){

            // Traverse all edges
            for(int j = 0; j < graph.length; j++){

                for(int k = 0; k < graph[j].size(); k++){

                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;


                    // ⚠️ WARNING 1:
                    // You wrote dist[V]
                    // V is number of vertices, not destination index
                    // It should be dist[v]

                    if(dist[u] != Integer.MAX_VALUE 
                        && dist[u] + wt < dist[v]){


                        // relaxation
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }


        // Print shortest distance
        for(int i = 0; i < dist.length; i++){

            // ⚠️ WARNING 2:
            // If a node is unreachable, it will print 2147483647
            // (Integer.MAX_VALUE)
            // You can handle it like this:

            if(dist[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }
            else{
                System.out.println(dist[i]);
            }
        }

    }



    public static void main(String[] args){

        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);


        // ⚠️ WARNING 3:
        // You created graph but never called bellmanFord()
        // so program will show no output

        System.out.println("Sortest Distance from Source ");
        bellmanFord(graph, 0);

    }
}