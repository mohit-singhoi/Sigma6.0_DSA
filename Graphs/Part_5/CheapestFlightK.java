// Cheapest Flight within K Stops Problem

// There are n cities connected by some number of flights. You are given an array flights where flights[i] = [from, to, price] indicates that there is a flight.
//You have also given three integers src, dst, and k, return cheapest price from src to dst with atmost k stops. if there is no such route , return -1;
// given all values are postive

public class CheapestFlightK {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;

        }
    }

        // Create Graph
        public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < flights.length; i++) {
                int src = flights[i][0];
                int dest = flights[i][1];
                int wt = flights[i][2];

                Edge e = new Edge(src, dest, wt);
                graph[src].add(e);
            }
        }
    
        public static void main(String[] args){
            int n = 4;
            int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
            int src = 0, dst = 3, k =1;

            ArrayList<Edge> graph[] = new ArrayList[n];
            createGraph(flights, graph);
        }
}
