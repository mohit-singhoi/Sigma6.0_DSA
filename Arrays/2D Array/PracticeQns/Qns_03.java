//WAP to print the transpose matrix
package PracticeQns;

public class Qns_03 {
    public static void transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
      
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };

        System.out.println("Transpose Matrix :");
       transposeMatrix(matrix);
    }

}
