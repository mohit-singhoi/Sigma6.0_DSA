// NQueens Problem: Place N queens on an N x N chessboard such that no two queens threaten each other.
public class NQueenProblem {
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board, row + 1); // Function call
            board[row][j] = 'x'; // backtracking step
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

    // main fun
    public static void main(String[] args) {
        int n= 2;
        char board[][] = new char[n][n];
        // initialize queens
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
            
        
    }

}
