package PracticeQns;

public class Qns_02 {
    public static int[][] transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int transposedMatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };

        System.out.println("Original Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        int result[][] = transposeMatrix(matrix);
        System.out.println("Transposed Matrix : ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
