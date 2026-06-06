// Subarray sum equal to k problem
// Given an array of integers and an integer k, find the total number of continuous subarrays whose sum equals to k.
// Also print all subarray using brute force approach



public class SubArraySum {
    public static void main(String[] args) {

        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                    System.out.print("Subarray with sum " + k + " => [ ");
                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
        System.out.println("Total subarrays with sum " + k + " => " + count);
    }
    
}
