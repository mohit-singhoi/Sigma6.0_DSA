public class DiagonalSum {

    public static int diagonalSum(int matrix[][]) { // O(n^2)
       // int row = matrix.length;
       // int col = matrix[0].length;
        int sum = 0;

        // 1st Approach
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (i==j) {
        // sum += matrix[i][j];
        // }
        // else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // 2nd Approach
        for (int i = 0; i < matrix.length; i++) { // O(n)
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int result = diagonalSum(matrix);
        System.out.println("Diagonal Sum : " + result);
    }
}
