// Qns_03 : Rotten Oranges Problem

// We have a matrix of dimension m*n where each cell in the matrix can have
// values 0, 1 or 2 which has the following meaning:
//
// 0 : Empty cell
// 1 : Cell has fresh orange
// 2 : Cell has rotten orange
//
// We have to determine the minimum time required so that all oranges become rotten.
//
// A rotten orange at index [i,j] can rot a fresh orange at indexes:
// [i-1,j], [i+1,j], [i,j-1], [i,j+1]
// (up, down, left and right)
//
// If it is impossible to rot every orange then simply return -1.

// Input:
// arr[][C] = {
//   {2, 1, 0, 2, 1},
//   {0, 0, 1, 2, 1},
//   {1, 0, 0, 2, 1}
// }
//
// Output:
// All oranges cannot be rotten.
//
// Explanation:
//
// At 0th time frame:
//
// {2, 1, 0, 2, 1}
// {0, 0, 1, 2, 1}
// {1, 0, 0, 2, 1}
//
//
// At 1st time frame:
//
// {2, 2, 0, 2, 2}
// {0, 0, 2, 2, 2}
// {1, 0, 0, 2, 2}
//
//
// At 2nd time frame:
//
// {2, 2, 0, 2, 2}
// {0, 0, 2, 2, 2}
// {1, 0, 0, 2, 2}
//
//
// The orange at the bottom left corner (1) is never rotten.
//
// Hence answer is:
// All oranges cannot be rotten.

import java.util.*;

public class Qns_03 {


    static int rottenOranges(int arr[][]) {

        int m = arr.length;
        int n = arr[0].length;


        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;


        // Add all rotten oranges
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(arr[i][j] == 2) {
                    q.add(new int[]{i,j});
                }

                else if(arr[i][j] == 1) {
                    fresh++;
                }
            }
        }


        int dir[][] = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };


        while(!q.isEmpty() && fresh > 0) {


            int size = q.size();
            time++;


            for(int i = 0; i < size; i++) {


                int curr[] = q.remove();

                int x = curr[0];
                int y = curr[1];


                for(int d[] : dir) {


                    int nx = x + d[0];
                    int ny = y + d[1];


                    if(nx >= 0 && nx < m &&
                       ny >= 0 && ny < n &&
                       arr[nx][ny] == 1) {


                        arr[nx][ny] = 2;
                        fresh--;

                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }


        if(fresh > 0)
            return -1;


        return time;
    }



    public static void main(String args[]) {


        int arr[][] = {
            {2,1,0,2,1},
            {0,0,1,2,1},
            {1,0,0,2,1}
        };


        int ans = rottenOranges(arr);


        if(ans == -1)
            System.out.println("All oranges cannot be rotten");
        else
            System.out.println("Minimum time = " + ans);

    }
}
