// Majority Element Problem 

import java.util.*;
public class MajorityEle {
    //O(n) -> This is a best approach for finding majority element in the given array
    public static int findMajorityElement(int nums[]){
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
        System.out.println("Majority Element : "+findMajorityElement(nums));
        

    }
    
}
