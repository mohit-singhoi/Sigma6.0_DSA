// Majority Element Problem : 169
//Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

import java.util.*;
public class MajorityEle {

    //1st Approach
    //O(n^2)-> This is a worst case Approach TC is very high
    public static int findMajorityElement(int nums[]){
        int n = nums.length;
        for(int val : nums){
            int freq = 0;
            for(int el : nums){
                if( el == val){
                    freq++;
                }
            }
            if(freq > n/2){
                return val;
            }
        }
        return -1;

    }

    //2nd Approach -> It is a better from previous approach
    //O(nlogn)
    public static int findMajorityElement1(int nums[]){
        int n = nums.length;

        //sort array
        Arrays.sort(nums);

        //freq count
        int freq =1;
        int  ans = nums[0];
        for(int i = 1;i<n;i++){
            if(nums[i] == nums[i-1]){
                freq++;
            } else{
                freq =1;
                ans = nums[i];
            }
            if(freq > n/2){
                return ans;
            }
        }
        return ans;
    }
    

    //3nd Approach
    //O(n) -> This is a best approach for finding majority element in the given array
    public static int findMajorityElement2(int nums[]){
        int n = nums.length;
        int freq = 0, ans = 0;

        for(int i =0;i<n;i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            } else{
                freq--;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int nums[] = {2,2,1,1,1,2,2};
        int nums1[] = {3,2,3};
        int nums2[] = {3,3,4,2,4,4,2,4};
        System.out.println("Majority Element 1st : "+findMajorityElement(nums));
        System.out.println("Majority Element 2nd : "+findMajorityElement1(nums1));
        System.out.println("Majority Element 3rd : "+findMajorityElement2(nums2));
        

    }
    
}
