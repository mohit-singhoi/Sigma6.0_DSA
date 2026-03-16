// NQueens Problem: Place N queens on an N x N chessboard such that no two queens threaten each other.
import java.util.Scanner;
public class NQueenProblem {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // Function call
                board[row][j] = 'x'; // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------Chess Board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + "  ");
                
            }
            System.out.println();
            
        }
    }

    static int count = 0;
    // main fun
    public static void main(String[] args) { // TC O(N!), SC O(N^2)
        int n;
        System.out.print("Enter the number of queens: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   
        char board[][] = new char[n][n];
        // initialize queens
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        sc.close();

        System.out.println("\nTotal solutions: " + count);
        
    }

}
