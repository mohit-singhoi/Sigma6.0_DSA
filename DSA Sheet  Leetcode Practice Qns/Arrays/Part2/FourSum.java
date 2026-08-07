// 4Sum Problem : 18

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
     public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // For loop for first number
        for(int i =0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1])
            continue;// skip duplicates
            for(int j =i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1])
                continue; //skip duplicates

                long remainingTarget = (long)target - nums[i] - nums[j];
                int left = j+1, right = n-1;

                //Two pointer search for remaining 2 numbers
                while(left<right){
                    int sum = nums[left] + nums[right];

                    if(sum <remainingTarget){
                        left++;
                    } else if (sum> remainingTarget){
                        right--;
                    } else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        //Skip duplicates
                        int prevLeft = nums[left], prevRight = nums[right];
                        while(left < right && nums[left] == prevLeft)
                        left++;

                        while(left < right && nums[right] == prevRight)
                        right--;
                    }
                }
            }
        }
        return result;
        
    }
    
}
