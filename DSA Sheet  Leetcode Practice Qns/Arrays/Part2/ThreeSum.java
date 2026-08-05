// 3Sum Problem : 15
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.

// Example 2:
// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

import java.util.*;


public class ThreeSum {
    //Better Approach: O(n^2) time complexity and O(n) space complexity
       public static  List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums); // Step 1: Sort the array


       Set<List<Integer>> set = new HashSet<>(); // Step 2: Use a Set to store unique triplets


       // Step 3: Loop through each number
       for (int i = 0; i < n - 2; i++) {
           int low = i + 1;
           int high = n - 1;
           int target = -nums[i]; // Step 4: Target two-sum = -nums[i]


           // Step 5: Two-pointer search
           while (low < high) {
               int sum = nums[low] + nums[high];
               if (sum == target) {
                   // Found a triplet
                   set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                   low++;
                   high--;
               } else if (sum < target) {
                   low++; // Need a bigger sum
               } else {
                   high--; // Need a smaller sum
               }
           }
       }


       // Step 6: Convert set to list
       ans.addAll(set);
       return ans;
   }

   // Best Approach 
   public static List<List<Integer>> threeSum1(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums); // Step 1: Sort the array
       for (int i = 0; i < n - 2; i++) {
           // Step 2: Skip duplicates for the first element
           if (i > 0 && nums[i] == nums[i - 1]) continue;
           int target = -nums[i];
           int left = i + 1, right = n - 1;
           // Step 3: Two-pointer approach
           while (left < right) {
               int sum = nums[left] + nums[right];


               if (sum == target) {
                   result.add(Arrays.asList(nums[i], nums[left], nums[right]));


                   // Step 4: Skip duplicate values
                   while (left < right && nums[left] == nums[left + 1]) left++;
                   while (left < right && nums[right] == nums[right - 1]) right--;


                   left++;
                   right--;
               } else if (sum < target) {
                   left++;
               } else {
                   right--;
               }
           }
       }


       return result;
   }




       public static void main(String[] args) {
       int[] nums = {-1, 0, 1, 2, -1, -4};
       int[] nums1 = {0, 0,0};

       System.out.println("1st Approach Output:");
       List<List<Integer>> res = threeSum(nums);

       for (List<Integer> triplet : res) {
           System.out.println(triplet);
       }

       System.out.println("\n2nd Approach Output:");
        List<List<Integer>> res1 = threeSum1(nums1);

       for (List<Integer> triplet1 : res1) {
           System.out.println(triplet1);
       }
   }
    
}
