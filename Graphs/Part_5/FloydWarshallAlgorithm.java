// Def : Floyd-Warshall Algorithm is an algorithm for finding the shortest path between all the pairs of vertices in a weighted graph. This algorithm works for both the directed and undirected weighted graphs. 
// But, it does not work for the graphs with negative cycles (where the sum of the edges in a cycle is negative).

// Floyd-Warshall Algorithm
// Finds the shortest distance between every pair of vertices.

public class FloydWarshallAlgorithm {

    // Value representing infinity (no direct edge)
    static final int INF = 99999;

    // Number of vertices
    static final int V = 4;

    // Function to find shortest distances
    void floydWarshall(int[][] graph) {

        // Create distance matrix
        int[][] dist = new int[V][V];

        // Copy graph into distance matrix
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Floyd-Warshall Algorithm
        for (int k = 0; k < V; k++) {

            for (int i = 0; i < V; i++) {

                for (int j = 0; j < V; j++) {

                    // Update distance if a shorter path exists through vertex k
                    if (dist[i][k] != INF &&
                        dist[k][j] != INF &&
                        dist[i][k] + dist[k][j] < dist[i][j]) {

                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printSolution(dist);
    }

    // Print shortest distance matrix
    void printSolution(int[][] dist) {

        System.out.println("Shortest Distance Matrix:");

        for (int i = 0; i < V; i++) {

            for (int j = 0; j < V; j++) {

                if (dist[i][j] == INF) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(dist[i][j] + "\t");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Graph represented as an adjacency matrix
        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };

        FloydWarshallAlgorithm obj = new FloydWarshallAlgorithm();

        obj.floydWarshall(graph);
    }
}
