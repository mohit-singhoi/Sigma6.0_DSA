// Maximum Subarray using Kadane's Algorithm : 53
// Given an integer array nums, find the subarray with the largest sum, and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

public class kadaneAlgorithm {
    // Function to find the maximum subarray sum using Kadane's Algorithm
   public static int maxSubArray(int[] nums) {
       int n = nums.length;  // Length of the input array
       int currSum = nums[0];  // Initialize current subarray sum with the first element
       int maxSum = nums[0];   // Initialize the maximum subarray sum with the first element
      
       // Iterate through the array starting from the second element
       for (int i = 1; i < n; i++) {
           // Update currSum by either adding the current element to the subarray or starting a new subarray
           currSum = Math.max(currSum + nums[i], nums[i]);
           // Update maxSum with the larger of maxSum and currSum
           maxSum = Math.max(maxSum, currSum);
       }
       return maxSum;  // Return the maximum subarray sum found
   }
    
}
