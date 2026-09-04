// Product of Array Except Self : Leetcode 238

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. 

// Example 1 :
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2 :
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

import java.util.Arrays;
public class ProductArray1 {
    public static int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] ans = new int[n];


       for (int i = 0; i < n; i++) {
           int val = 1;
           for (int j = 0; j < n; j++) {
               if (i != j) {
                   val *= nums[j];
               }
           }
           ans[i] = val;
       }
       return ans;
   }

   public static void main(String[] args) {
         int[] nums = {1, 2, 3, 4};
         int[] result = productExceptSelf(nums);
         System.out.println(Arrays.toString(result)); // Output: [24, 12, 8, 6]
    } 
}
