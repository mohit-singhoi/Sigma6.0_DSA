// WAP to check if problem can be solved or not & print only one solution to N  Queens problem.

import java.util.Scanner;

public class NQueenProblem1 {
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
    public static boolean nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
           // printBoard(board);
            return true;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; // backtracking step
            }
        }
        return false;
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
        //boolean hasSolution = nQueens(board, 0);
        if(nQueens(board, 0)){
            System.out.println("Solution exists for the given number of queens");
            printBoard(board);
        } else {
            System.out.println("No solution exists for the given number of queens.");
        }
        sc.close();

        // if (!hasSolution) {
        //     System.out.println("No solution exists for the given number of queens.");
        // } else {
        //     System.out.println("\nTotal solutions: " + count);
        // }
    }
}