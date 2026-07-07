// Climbing Stairs Problem
// Count ways to reach the nth stair. The person can climb either 1 stairs at time.
// Fibonacci Code Approach

import java.util.Scanner;
public class ClimbindStairs {
    public static int countWays(int n){
        if( n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    public static void main(String[] args){
        //int n = 5; // n = 3 -> 3 & n = 4 -> 5 => 8
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();


        System.out.println("Total Ways : " + countWays(n) );

    }
    
}
