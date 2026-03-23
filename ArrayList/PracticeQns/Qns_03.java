package PracticeQns;

import java.util.*;

public class Qns_03 {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int maxCount = 0;
        int result = -1;

        for (int i = 0; i < nums.size() - 1; i++) {

            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                int count = 0;

                // count how many times this target follows key
                for (int j = 0; j < nums.size() - 1; j++) {
                    if (nums.get(j) == key && nums.get(j + 1) == target) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    result = target;
                }
            }
        }

        return result;
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
