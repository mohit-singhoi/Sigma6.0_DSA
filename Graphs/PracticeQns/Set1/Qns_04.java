// Qns_04 : Find the Size of Largest Region in Boolean Matrix

// We have a matrix where each cell contains either '0' or '1'.
// Any cell containing 1 is called a filled cell.
//
// Two cells are connected if they are adjacent horizontally,
// vertically, or diagonally.
//
// If one or more filled cells are connected, they form a region.
//
// Find the size of the largest region.
//
// Input:
//
// M[][5] = {
//   {0, 0, 1, 1, 0},
//   {0, 0, 1, 1, 0},
//   {0, 0, 0, 0, 0},
//   {0, 0, 0, 0, 1}
// }
//
// Output:
// 4
//
// Explanation:
//
// The connected region:
//
// {1,1}
// {1,1}
//
// contains 4 filled cells.
//
// The last 1 is a separate region.
//
// Hence largest region size = 4.


import java.util.*;

public class Qns_04 {


    static int m;
    static int n;


    static int largestRegion(int mat[][]) {

        m = mat.length;
        n = mat[0].length;


        boolean visited[][] = new boolean[m][n];

        int max = 0;


        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {


                if(mat[i][j] == 1 && !visited[i][j]) {

                    int size = bfs(mat, i, j, visited);

                    max = Math.max(max, size);
                }
            }
        }


        return max;
    }



    static int bfs(int mat[][], int x, int y, boolean visited[][]) {


        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{x,y});
        visited[x][y] = true;


        int count = 0;


        // 8 directions (horizontal, vertical, diagonal)
        int dir[][] = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},           {0,1},
            {1,-1},  {1,0},   {1,1}
        };



        while(!q.isEmpty()) {


            int curr[] = q.remove();

            int i = curr[0];
            int j = curr[1];

            count++;



            for(int d[] : dir) {


                int ni = i + d[0];
                int nj = j + d[1];


                if(ni >= 0 && ni < m &&
                   nj >= 0 && nj < n &&
                   mat[ni][nj] == 1 &&
                   !visited[ni][nj]) {


                    visited[ni][nj] = true;
                    q.add(new int[]{ni,nj});
                }
            }
        }


        return count;
    }




    public static void main(String args[]) {


        int mat[][] = {
            {0,0,1,1,0},
            {0,0,1,1,0},
            {0,0,0,0,0},
            {0,0,0,0,1}
        };


        System.out.println(largestRegion(mat));

    }
}
