// WAP to solve a Sudoku puzzle using backtracking

public  class SudokuSolver{
    public static boolean isSafe(int[][] sudoku, int row, int col, int num) {
        // Check if 'num' is not in the current row and column
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == num || sudoku[i][col] == num) {
                return false;
            }
        }

        // Check in  grid
        // Check if 'num' is not in the current 3x3 box
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }


            }
        }

        return true;
    }

    public static boolean solveSudoku(int[][] sudoku, int row, int col) {

        // base case: If there is no empty cell, the puzzle is solved
        if(row == 9){
            return true;
        }

        // recursive case: Find an empty cell and try to fill it with a valid number
        int nextRow = row , nextCol = col + 1;
        if(nextCol == 9){
            nextRow = row + 1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0){
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        for(int num = 1; num <= 9; num++){
            if(isSafe(sudoku, row, col, num)){
                sudoku[row][col] = num; // Place the number

                if(solveSudoku(sudoku, nextRow, nextCol)){
                    return true; // Recur to solve the rest of the sudoku
                }

                sudoku[row][col] = 0; // Backtrack
            }
        }
        return false; // Trigger backtracking
    }

    // Utility function to print the Sudoku grid
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

// Main function
public static void main(String[] args) {
    int[][] sudoku = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8 ,0},
        {0 ,0 ,0 ,4 ,1 ,9 ,0 ,0 ,5},
        {0 ,0 ,0 ,0 ,8 ,0 ,0 ,7 ,9}
    };

    if(solveSudoku(sudoku, 0, 0)){
        System.out.println("Solution solved Successfully:");
        printSudoku(sudoku);
    } else {
        System.out.println("No solution exists for the given Sudoku puzzle.");
    }

    }
}