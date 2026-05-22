// Qns_03.java : path with Minimum Cost
// We have a two-dimensional grid in which each cell contains an integer cost representing the cost of traversing that cell. The task is to find a path from the top-left cell to the bottom-right cell such that the total cost incurred while travelling through the grid is minimum.

// Input: heights = [[31,100,65,12,18],[10,13,47,157,6],[100,113,174,11,33],[88,124,41,20,140],[99,32,111,41,20]]

// Output: 327 =(31+10+13+47+65+12+18+6+33+11+20+41+20)

package PracticeQns;

import java.util.*;

public class Qns_03 {

    static class Pair {
        int row, col, cost;

        Pair(int row, int col, int cost) {
            this.row = row;
            this.col = col;
            this.cost = cost;
        }
    }

    public static int minCost(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a,b) -> a.cost - b.cost);

        boolean[][] visited = new boolean[n][m];

        // Start cell
        pq.add(new Pair(0,0,grid[0][0]));

        // 4 directions
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        while(!pq.isEmpty()) {

            Pair curr = pq.poll();

            int r = curr.row;
            int c = curr.col;
            int cost = curr.cost;

            if(visited[r][c])
                continue;

            visited[r][c] = true;

            // Destination reached
            if(r == n-1 && c == m-1)
                return cost;

            // Visit neighbours
            for(int i=0;i<4;i++) {

                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr>=0 && nr<n &&
                   nc>=0 && nc<m &&
                   !visited[nr][nc]) {

                    int newCost =
                        cost + grid[nr][nc];

                    pq.add(
                      new Pair(nr,nc,newCost)
                    );
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {31,100,65,12,18},
            {10,13,47,157,6},
            {100,113,174,11,33},
            {88,124,41,20,140},
            {99,32,111,41,20}
        };

        System.out.println("Minimum cost to reach destination: " + minCost(grid));
    }
}
