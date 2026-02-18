// Given a " 2 x n" floor and tiles of size "2 X 1", count the number of ways to tile the given board using the 2x1  tiles.
// ( A tile can  either be placed horizontally or verticle).
package Part2;

public class TrilingProblem {
    public static int tilingProblem(int n){
        // base case
        if(n == 0 || n ==1 ){
            return 1;
        }

        // Verticle choice
        int fnm1 = tilingProblem(n-1);

        // Horizontal choice
        int fnm2 = tilingProblem(n-2);

        int toWays = fnm1 + fnm2;
        return toWays;
    }

    // Main fun
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total No. of ways : " +tilingProblem(n));
    }
}
