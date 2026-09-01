// Set Matrix Zeroes Problem: Leetcode 73 Qns

// Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. You must do it in place.
// 0-1 Matrix Problem : Hotel Maintenance
// Imagine a hotel where rooms are arranged in a grid, like a 0-1 matrix. If a room has a major issue (marked as 0), the entire row and column must be closed for repairs.
// Instead of manually tracking, a smart system updates all affected rooms automatically, just like how we modify a 0-1 matrix to set entire rows and columns to zero when a 0 is found. 
// This helps manage problems efficiently without affecting other rooms.

// Example 1:

// Input: matrix = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Example 2:

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

public class MatrixZero {
    public static void setZeros(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean col = false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col = true;
            }
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
       for (int i = n - 1; i >= 0; i--) {
           for (int j = m - 1; j >= 1; j--) {
               if (matrix[i][0] == 0 || matrix[0][j] == 0)
                   matrix[i][j] = 0;
           }
           if (col)
           matrix[i][0] = 0;
       }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);
        setZeros(matrix1);
        System.out.println("Modified Matrix 1:");
        printMatrix(matrix1);

        int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        System.out.println("Original Matrix 2:");
        printMatrix(matrix2);
        setZeros(matrix2);
        System.out.println("Modified Matrix 2:");
        printMatrix(matrix2);
    }
}
