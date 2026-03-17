// WAP of Knight's Tour Problem
public class Qns_05 {
    static int N = 8; // Size of the chessboard
    public static boolean isSafe(int[][] board, int x, int y) {
        return (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == -1);
    }

    public static boolean knightTour(int[][] board, int x, int y, int moveCount, int[] xMove, int[] yMove) {
        if (moveCount == N * N) {
            return true;
        }
        for (int k = 0; k < 8; k++) {
            int nextX = x + xMove[k];
            int nextY = y + yMove[k];
            if (isSafe(board, nextX, nextY)) {
                board[nextX][nextY] = moveCount;
                if (knightTour(board, nextX, nextY, moveCount + 1, xMove, yMove)) {
                    return true;
                }
                board[nextX][nextY] = -1; // Backtrack
            }
        }
        return false;
    }

    public static boolean knightTour(int[][] board, int x, int y, int moveCount) {
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
        return knightTour(board, x, y, moveCount, xMove, yMove);
    }

    public static void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    // Driver method
    public static void main(String[] args) {
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1};
        board[0][0] = 0; // Starting position

        System.out.println("Solution to the Knight's Tour problem:");
        if (knightTour(board, 0, 0, 1, xMove, yMove)) {
            printSolution(board);
        } else {
            System.out.println("No solution found.");
        }
    }
}
