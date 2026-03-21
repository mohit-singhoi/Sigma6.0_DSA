// Arrange N soldiers in a line. Each soilder has a value from 1 to R.
// Find the number of ways to arrange the soldiers such that no two soldiers with the same value are adjacent to each other.
// Rules  First soilder's  value must be 1 , last soilder's  value must be 'end'( given as input)  no two soldiers with the same value are adjacent to each other.
// Input  N - number of soldiers
// R - range of values (1 to R)
// end - value of the last soldier
// Using recursion , backtracking and memoization to solve the problem

public class Qns_03 {

    public static void generate(int N, int R, int end, int[] arr, int index) {

        // If full array is filled
        if (index == N) {
            // Check last condition
            if (arr[N - 1] == end) {
                printArray(arr);
            }
            return;
        }

        // Try all values from 1 to R
        for (int val = 1; val <= R; val++) {

            // Condition 1: No same adjacent
            if (index > 0 && arr[index - 1] == val) continue;

            // Condition 2: Last position must be 'end'
            if (index == N - 1 && val != end) continue;

            arr[index] = val;
            generate(N, R, end, arr, index + 1);
        }
    }

    static int count =0;
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        count++;
        
    }


    public static void main(String[] args) {
        int N = 4;
        int R = 4;
        int end = 3;

        int[] arr = new int[N];

        // First soldier must be 1
        arr[0] = 1;

        generate(N, R, end, arr, 1);
        System.out.println("Total Ways: " + count);
    }
}
