package PracticeQns;

import java.util.*;

public class Qns_03 {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {

        int[] freq = new int[1000]; // assuming values are <= 1000

        // count frequency of targets after key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                freq[target]++;   // no need for -1 adjustment
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        // find maximum frequency
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        int key = 1;

        System.out.println("Output: " + mostFrequent(nums, key));
    }
}