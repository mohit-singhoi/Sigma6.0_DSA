//Given an integer array nums, return true if any value appears
// alt least twice in the array, and return false if every element is distinct.
// Given array is nums = [1,2,3,1]

package Array_Part2.Practice;

public class Qns_02 {
    public static boolean twiceElement(int nums[]) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        if (count >= 2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        //int result = twiceElement(nums);
        System.out.println("In this Num[] Array Twice element is Exists ? : " + twiceElement(nums));
    }

}
