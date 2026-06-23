// Qns_01 : Detect cycle in an undirected graph using BFS.

// We have an undirected graph , how to check it there is a cycle in the graph? For example, the following graph has a cycle 1-0-2-1..

// Input : 
/* 
 9 - 5 - 2
 |  /    |
 1       4
*/

// Output : Yes

import java.util.*;

public class Qns_01 {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    static boolean detectCycle(ArrayList<Edge>[] graph, int V) {

        boolean visited[] = new boolean[V];

        // check for disconnected components
        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (bfs(graph, i, visited)) {
                    return true;
                }
            }
        }

        return false;
    }


    static boolean bfs(ArrayList<Edge>[] graph, int start, boolean visited[]) {

        Queue<int[]> q = new LinkedList<>();

        // node, parent
        q.add(new int[]{start, -1});
        visited[start] = true;


        while (!q.isEmpty()) {

            int curr[] = q.remove();

            int node = curr[0];
            int parent = curr[1];


            for (Edge e : graph[node]) {

                int neighbour = e.dest;


                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(new int[]{neighbour, node});

                } 
                else if (neighbour != parent) {

                    // visited node is not parent => cycle
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String args[]) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }


        // 0--1
        // |  |
        // 2--

        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));

        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));

        graph[2].add(new Edge(2,0));
        graph[0].add(new Edge(0,2));


        if(detectCycle(graph,V))
            System.out.println("Detect Cycle ");
        else
            System.out.println("No Detect any Cycle");
    }
}
