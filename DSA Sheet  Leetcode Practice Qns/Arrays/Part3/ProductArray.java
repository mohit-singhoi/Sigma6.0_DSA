// Product of Array Except Self : Leetcode 238

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. 

// Example 1 :
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2 :
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

import java.util.Arrays;

public class ProductArray {
   public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
      
       // Create answer array and initialize with 1
       int[] ans = new int[n];
       Arrays.fill(ans, 1);


       // Calculate prefix product and store in ans
       for (int i = 1; i < n; i++) {
           ans[i] = ans[i - 1] * nums[i - 1];
       }


       // Calculate suffix product and update ans
       int suffix = nums[n - 1];
       for (int i = n - 2; i >= 0; i--) {
           ans[i] = ans[i] * suffix; // prefix * suffix
           suffix *= nums[i];
       }


       return ans;
   }

    public static void main(String[] args) {
         ProductArray productArray = new ProductArray();
         int[] nums = {1, 2, 3, 4};
         int[] result = productArray.productExceptSelf(nums);
         System.out.println(Arrays.toString(result)); // Output: [24, 12, 8, 6]
    } 
}
