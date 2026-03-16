// Grid Ways: Count the number of ways to reach the bottom-right corner of a grid from the top-left corner, moving only right or down.
public class GridWays {
    public static int gridWays(int i, int j, int m, int n) {
        // base case
        if (i == m - 1 && j == n - 1) { // reached the destination
            return 1;
        } else if (i == m || j == n) { // out of bounds
            return 0;
        }

        // recursive calls
        int downWays = gridWays(i + 1, j, m, n);
        int rightWays = gridWays(i, j + 1, m, n);

        return downWays + rightWays;
    }

    // main function
    public static void main(String[] args) {
        int m = 3; // number of rows
        int n = 3; // number of columns
        System.out.println("Total ways to reach the bottom-right corner: " + gridWays(0, 0, m, n));
    }
    
}
