import java.util.Scanner;

public class AddMatrix {
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

    }
}
