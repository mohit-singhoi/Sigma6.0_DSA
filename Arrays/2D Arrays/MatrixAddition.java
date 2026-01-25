public class MatrixAddition {
    public static int[][] matrixAddition(int arr1[][], int arr2[][]) {
        int row = arr1.length;
        int col = arr1[0].length;

        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        return matrix;
    }

    // After addition print the final matrix
    public static void printMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");

            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result[][] = matrixAddition(arr1, arr2);
        System.out.println("\nMatrix Multiplication :\n");
        matrixAddition(arr1, arr2);
        printMatrix(result);

    }

}
