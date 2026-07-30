// Find Missing and Repeated value LeetCode Problem No: 2965 
// Input: grid = [[1,3],[2,2]]
// Output: [2,4]
// Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].

// Find Missing and Repeated Value
// LeetCode 2965

import java.util.*;

public class MissingRepeatedValue {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();

        int n = grid.length;
        int totalNumbers = n * n;

        int currentSum = 0;
        int[] ans = new int[2]; // ans[0] = repeated, ans[1] = missing

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (set.contains(grid[i][j])) {
                    ans[0] = grid[i][j]; // Repeated value
                } else {
                    set.add(grid[i][j]);
                    currentSum += grid[i][j];
                }
            }
        }

        int totalSum = totalNumbers * (totalNumbers + 1) / 2;
        ans[1] = totalSum - currentSum; // Missing value

        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        int[] result = findMissingAndRepeatedValues(grid);

        System.out.println("Repeated Value : " + result[0]);
        System.out.println("Missing Value  : " + result[1]);
        System.out.println("Answer         : " + Arrays.toString(result));
    }
}