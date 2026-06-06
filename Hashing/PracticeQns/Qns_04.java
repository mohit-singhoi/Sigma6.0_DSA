// Qns_04: Two Sum problem
// Given an array of integers arr[] and an integer target , return indices of the two numbers such that they add up to target.
// you may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Sample Input
// arr[] = {2, 7, 11, 15}, target = 9
// Sample Output
// [0, 1] (because arr[0] + arr[1] = 2 + 7 = 9)



package PracticeQns;

import java.util.*;

public class Qns_04 {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(" Output : [" + result[0] + ", " + result[1] + "]");
    }
    
}
