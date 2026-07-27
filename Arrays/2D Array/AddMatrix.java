import java.util.Scanner;

public class AddMatrix {


    public static boolean searchelement(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at index: [" + i + "," + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int m= matrix.length;
        int n= matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arrays elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\n2D Matrix\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("\n");
        }
        
        sc.close();

        int key = 5;
        searchelement(matrix, key);

    }
}
