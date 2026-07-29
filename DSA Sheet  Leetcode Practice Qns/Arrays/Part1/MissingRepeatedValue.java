// Find Missing and Repeated value LeetCode Problem : 2965
// Input: grid = [[1,3],[2,2]]
// Output: [2,4]
// Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
public class MissingRepeatedValue{
    publi static int findMissingAndrepeatedvalues(int grid[][]){
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int sq = n*n;
        
        int currSum = 0;
        int ans[] = new int[2];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                    currSum += grid[i][j];
                }
            }
        }
        
    }


    public static void main(String[] args) {
        int grid[][] = {{1,3},{2,2}}; 
    }
}