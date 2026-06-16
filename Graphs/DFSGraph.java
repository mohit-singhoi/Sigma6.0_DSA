import java.util.*;

public class DFSGraph {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int neighbor : graph[curr]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);

        visited = new boolean[V];

        System.out.print("DFS Traversal: ");
        dfs(0);
    }
}