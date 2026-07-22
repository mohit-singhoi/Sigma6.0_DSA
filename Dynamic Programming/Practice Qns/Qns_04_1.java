// Qns_04_1 : Longest increasing Path in Matrix using memoization
// We have a matrix of N rows and M columns. from m[i][j], we can move to m[i+1][j], if m[i+1][j]>m[i][j] , or can move to m[i][j+1] if m[i][j+1] > m[i][j].
// The task is to print the longest path length if we start from (0,0).

// Input ; n = 4, M = 4
// m[][] = {{1,2,3,4},{2,2,3,4},{3,2,3,4},{4,5,6,7}};

// Output : 7
// Longest Path is 1 2 3 4 5 6 7 


// Input : N = 2, M = 2
// m[][] = {{1,2},{3,4}};

// Output : 3
// Longest path is either 1 2 4 or 1 3 4

import java.util.Arrays;

public class Qns_04_1 {

    //O(N*M)
    public static int longestPath(int[][] mat, int i, int j, int[][] dp) {
        int n = mat.length;
        int m = mat[0].length;

        // Last cell
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = 1;

        // Move Down
        if (i + 1 < n && mat[i + 1][j] > mat[i][j]) {
            ans = Math.max(ans, 1 + longestPath(mat, i + 1, j, dp));
        }

        // Move Right
        if (j + 1 < m && mat[i][j + 1] > mat[i][j]) {
            ans = Math.max(ans, 1 + longestPath(mat, i, j + 1, dp));
        }

        dp[i][j] = ans;
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3, 4},
                {2, 2, 3, 4},
                {3, 2, 3, 4},
                {4, 5, 6, 7}
        };

        int n = mat.length;
        int m = mat[0].length;

        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Longest Path Length = " + longestPath(mat, 0, 0, dp));
    }
}
