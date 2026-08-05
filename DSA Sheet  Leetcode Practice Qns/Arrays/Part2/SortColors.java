// Sort array of 0s, 1s & 2s | Set Colors problem: 75
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

import java.util.Arrays;

public class SortColors {

    // Helper method to swap elements in the array
   private static void swap(int[] nums, int a, int b) {
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;
   }


   public static void sortColors(int[] nums) {
       // Dutch National Flag algorithm
       int low = 0, mid = 0, high = nums.length - 1;


       // Loop through the array
       while (mid <= high) {
           if (nums[mid] == 0) {
               // Move 0 to the beginning
               swap(nums, low, mid);
               low++;
               mid++;
           } else if (nums[mid] == 1) {
               // Leave 1 in place
               mid++;
           } else {
               // Move 2 to the end
               swap(nums, mid, high);
               high--;
           }
       }
   }


   public static void main(String[] args) {
       int[] nums = {2, 0, 2, 1, 1, 0};
       sortColors(nums);
       System.out.println("Sorted colors: " + Arrays.toString(nums));
   }
    
}
