// Qns_05 : find Number of closed Islands problem

// We have a binary matrix `mat[][]` of dimensions `N × M` such that `1` denotes **land** and `0` denotes **water**.
// Find the **number of closed islands** in the given matrix.
// A **closed island** is a group of `1`s that is surrounded by `0`s on **all four sides** (excluding diagonals).
// If any `1` is present on the **boundary (edges)** of the matrix, then it is **not considered** part of a closed island because it is not completely surrounded by `0`s.

// Sample Input 1
// N = 3, M = 3
// mat = {{1,0,0},
//         {0,1,0},
//         {0,0,1}};
// Sample Output 1 : 1

// Sample Input 2
// N = 5, M = 8
// mat = {{1,1,1,1,0,0,0,0},
//         {1,0,0,1,0,0,0,0},
//         {1,0,0,1,0,0,0,0},
//         {1,0,0,1,0,0,0,0},
//         {1,1,1,1,0,0,0,0}};
// Sample Output 2 : 2

public class Qns_05 {

    static int N, M;

    // DFS function
    static boolean dfs(int[][] mat, boolean[][] vis, int i, int j) {

        // Out of boundary
        if (i < 0 || j < 0 || i >= N || j >= M)
            return false;

        // Water or already visited
        if (mat[i][j] == 0 || vis[i][j])
            return true;

        vis[i][j] = true;

        // If land touches boundary, not closed
        boolean closed = !(i == 0 || j == 0 || i == N - 1 || j == M - 1);

        // Visit all 4 directions
        boolean up = dfs(mat, vis, i - 1, j);
        boolean down = dfs(mat, vis, i + 1, j);
        boolean left = dfs(mat, vis, i, j - 1);
        boolean right = dfs(mat, vis, i, j + 1);

        return closed & up & down & left & right;
    }

    static int countClosedIslands(int[][] mat) {

        N = mat.length;
        M = mat[0].length;

        boolean[][] vis = new boolean[N][M];

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (mat[i][j] == 1 && !vis[i][j]) {

                    if (dfs(mat, vis, i, j))
                        count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) { // O(N * M) time complexity, where N is the number of rows and M is the number of columns

        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        System.out.println("Closed Islands = " + countClosedIslands(mat));
    }
}
