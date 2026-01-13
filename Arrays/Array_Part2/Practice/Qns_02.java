//WAP to print the sub array & sum of  each sub array and print the total sub array and also print the largest and smallest sum.

package Array_Part2.Practice;

public class Qns_02 {

    public static void printSubArray(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end =j;

                int sum = 0; // reset for each subarray
                System.out.print("Subarray (");

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];

                    if (k < j) {
                        System.out.print(", ");
                    }
                }

                System.out.println(") = " + sum);

                // update max and min sum
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }

        int ts = arr.length * (arr.length + 1) / 2;
        System.out.println("Total number of Subarray is : " + ts);
        System.out.println("Maximum Subarray Sum : " + maxSum);
        System.out.println("Minimum Subarray Sum : " + minSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}
