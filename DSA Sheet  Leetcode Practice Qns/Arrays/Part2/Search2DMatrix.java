// Search a 2D Matrix : 74
//You are given an m x n integer matrix matrix with the following two properties:
// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// Example 1:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// Example 2:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

public class Search2DMatrix {

    public static boolean searchInRow(int[][] matrix, int target, int row){ // O(logn)
        int n =matrix[0].length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = st +(end-st)/2;
            if(target == matrix[row][mid]){
                return true;
            } else if(target > matrix[row][mid]){
                st = mid+1;
            } else{
                end = mid-1;
            }
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) { // O(logm + logn)
        int m = matrix.length, n =matrix[0].length;

        int startRow = 0, endRow = m-1;
        while(startRow <=endRow){
            int midRow = startRow +(endRow - startRow)/2;

            if(target >= matrix[midRow][0] && target <= matrix[midRow][n-1]){
                return searchInRow(matrix, target, midRow);
            } else if(target >= matrix[midRow][n-1]){
                // down => right
                startRow = midRow+1;
            } else{
                //up => left
                endRow = midRow-1;
            }
        }
        return false;
    }

  public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        boolean result = searchMatrix(matrix, target);

        System.out.println("Result: " + result);
    }


}
