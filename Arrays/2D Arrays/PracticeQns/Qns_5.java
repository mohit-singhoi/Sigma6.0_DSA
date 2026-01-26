package PracticeQns;

public class Qns_5 {
    public static int[][] matrixMultiplication(int a[][], int b[][]){
        int rowA = a.length;
        int colA = a[0].length;
        int rowB = b.length;
        int colB = b[0].length;

        if(colA != rowB){
            System.out.println("Matrix multiplication not possible");
            return new int[][]{};
        }

        int result[][] = new int[rowA][colB];

        for(int i = 0; i < rowA; i++){
            for(int j = 0; j < colB; j++){
                for(int k = 0; k < colA; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Function to print matrix
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{7,8},{9,10},{11,12}};
        
        int result[][] = matrixMultiplication(a, b);

        System.out.println("Matrix Multiplication Result:");
        printMatrix(result);
    }
}
