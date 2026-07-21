// Minimum Partitioning Problem/ Minimum subset sum difference/Partitioning subsets.
// Numbers[] = {1, 6, 11, 5}
// Min diff = 1

public class MinimumPartitioning {
    public static int minPartition(int arr[]){
        int n  = arr.length;
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }

        int W = sum/2;
        int dp[][] = new int [n+1][W+1];

        //Bottom up
        for(int i =1;i<n+1;i++){
            for(int j =1;j<W+1;j++){
                
            }
        }
    }

    public static void main(String[] args){
        int nums[] = {1,6,11,5};
    }
    
    
}
