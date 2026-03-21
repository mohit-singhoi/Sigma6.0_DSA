// Arrange N soldiers in a line. Each soilder has a value from 1 to R.
// Find the number of ways to arrange the soldiers such that no two soldiers with the same value are adjacent to each other.
// Rules  First soilder's  value must be 1 , last soilder's  value must be 'end'( given as input)  no two soldiers with the same value are adjacent to each other.
// Input  N - number of soldiers
// R - range of values (1 to R)
// end - value of the last soldier

public class Qns_02 {

    public static int countWays(int N, int R, int end) {
        int[][] dp = new int[N + 1][R + 1];

        // Base case
        dp[1][1] = 1;

        for (int i = 2; i <= N; i++) {
            int total = 0;

            // Calculate total ways for previous row
            for (int j = 1; j <= R; j++) {
                total += dp[i - 1][j];
            }

            // Fill current row
            for (int j = 1; j <= R; j++) {
                dp[i][j] = total - dp[i - 1][j];
                if (i == N && j != end) {
                    dp[i][j] = 0; // Last soldier must be 'end'
                }
            }
        }

        return dp[N][end];
    }

    public static void main(String[] args) {
        int N = 4;
        int R = 3;
        int end = 2;

        System.out.print("Total Ways: " + countWays(N, R, end));
    }
}