// WAP of Rat in a Maze Problem
public class Qns_03 {

    public static boolean solveMaze(int[][] maze, int[][] solution, int x, int y) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            solution[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;
            if (solveMaze(maze, solution, x + 1, y)) {
                return true;
            }
            if (solveMaze(maze, solution, x, y + 1)) {
                return true;
            }
            solution[x][y] = 0; // Backtrack
        }
        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1);
    }

    public static void printSolution(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver method
        public static void main(String[] args) { // Time Complexity: O(2^(m*n)) where m and n are the dimensions of the maze. In the worst case, we explore all possible paths.
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int[][] solution = new int[maze.length][maze[0].length];
        System.out.println("Solution to the Rat in a Maze problem:");
        if (solveMaze(maze, solution, 0, 0)) {
            printSolution(solution);
        } else {
            System.out.println("No solution found.");
        }
    }
    
}


