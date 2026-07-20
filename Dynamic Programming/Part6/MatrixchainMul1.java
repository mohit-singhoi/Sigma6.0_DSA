// Matrix chain Multiplication Problem using memoization.

public class MatrixchainMul1 {
    

    public static void main(String[] args){
        int arr[] = {1,2,3,4,3}; // n = 5
        int n = arr.length;

        int dp[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
    }
}
