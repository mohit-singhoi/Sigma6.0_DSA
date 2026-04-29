// Qns_05.java
// Split the given arrayinto k sub-arrays.
// Given an array arr[] containing N elements and an integer K such that 1 ≤ K ≤ N, the task is to divide the array into exactly K contiguous subarrays, ensuring that every element belongs to one and only one subarray. 
// Among these K subarrays, consider the sum of each subarray. The objective is to minimize the largest subarray sum among them.
// In other words, you must partition the array in such a way that the maximum sum of any single subarray is as small as possible, and then return this minimum possible value.

// Example 1:
// Input: arr = [1, 2, 3, 4, 5], K = 2
// Output: 9
// Explanation: We can split the array into two subarrays: [1, 2, 3] and [4, 5]. The sum of the first subarray is 6 and the sum of the second subarray is 9. The largest sum among these two subarrays is 9. It can be shown that there is no other way to split the array into two subarrays such that the largest sum is less than 9, so the answer is 9.
// Example 2:
// Input: arr = [1, 4, 4], K = 3
// Output: 4
// Explanation: We can split the array into three subarrays: [1], [4], and [4]. The sum of each subarray is 1, 4, and 4 respectively. The largest sum among these three subarrays is 4. It can be shown that there is no other way to split the array into three subarrays such that the largest sum is less than 4, so the answer is 4.

class Qns_05 {
    static int ans = Integer.MAX_VALUE;

    // Recursive function to split array into K subarrays
    static void solve(int[] arr, int n, int k, int index, int currentMax) {

        // Base case: only one partition left
        if (k == 1) {
            int sum = 0;
            for (int i = index; i < n; i++) {
                sum += arr[i];
            }
            currentMax = Math.max(currentMax, sum);
            ans = Math.min(ans, currentMax);
            return;
        }

        int sum = 0;

        // Try every possible partition
        for (int i = index; i <= n - k; i++) {
            sum += arr[i];
            solve(arr, n, k - 1, i + 1, Math.max(currentMax, sum));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;

        solve(arr, arr.length, k, 0, 0);

        System.out.println("Minimum possible maximum subarray sum: " + ans);
    }
}