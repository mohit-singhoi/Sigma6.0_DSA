// Print the sum of  the numbers in the 2nd row of the nums array 
// Example
// Input : -  int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};

package PracticeQns;

public class Qns_04 {
    public static int rowSum(int matrix[][]){
        int rowSum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==1){
                    rowSum+=matrix[i][j];
                }

            }
        }
        return rowSum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Sum of 2nd row : "+rowSum(matrix));
    }
    
}
