// Qns_04_2 : Longest increasing Path in Matrix using tabulation

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

public class Qns_04_2 {

    public static int longestPath(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] dp = new int[n][m];

        // Every cell itself forms a path of length 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = 1;
            }
        }

        // Fill from bottom-right
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (i + 1 < n && mat[i + 1][j] > mat[i][j]) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i + 1][j]);
                }

                if (j + 1 < m && mat[i][j + 1] > mat[i][j]) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3, 4},
                {2, 2, 3, 4},
                {3, 2, 3, 4},
                {4, 5, 6, 7}
        };

        System.out.println("Longest Path Length = " + longestPath(mat));
    }
}