// Given an array nums of size n, return the majority elements. The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class Qns_02 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    //Main method to test the function
    public static void main(String[] args) {
        Qns_02 solution = new Qns_02();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
