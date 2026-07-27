//Print the number 7's that are in the 2nd array.
// Input : int[][] array = {{4,7,8},{8,8,7}}
// Output : 2

package PracticeQns;

public class Qns_01 {
    public static int countElement(int matrix[][], int num){
        int count =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == num){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int num =7;
        int result = countElement(matrix, num);
        System.out.println(num + " Found : " + result + " times in this matrix.");
    }

    
}
