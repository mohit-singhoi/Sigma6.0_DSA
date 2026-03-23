// WAP of Lonely Numbers in ArrayList
// You are Given an Integer arrayList nums. A Number x is lonely when it appreas only once, and no adjacent numbers(i.e. x+1 and x-1) appears in the arraylist.
// Return all lonely numbers is nums. You may return the answer in any order.
// Sample input 1 : nums = [10,6,5,8] , output : [10,8] 
// Smaple sample input 2: nums = [1,3,5,3] , output  : [1,5]

package PracticeQns;

import java.util.*;

public class LonelyNumbers {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Sort the ArrayList
        Collections.sort(nums);

        int n = nums.size();

        for (int i = 0; i < n; i++) {

            // check duplicate (frequency > 1)
            if ((i > 0 && nums.get(i).equals(nums.get(i - 1))) ||
                (i < n - 1 && nums.get(i).equals(nums.get(i + 1)))) {
                continue;
            }

            // check neighbors (x-1 or x+1)
            boolean hasLeft = (i > 0 && nums.get(i) - nums.get(i - 1) == 1);
            boolean hasRight = (i < n - 1 && nums.get(i + 1) - nums.get(i) == 1);

            if (!hasLeft && !hasRight) {
                result.add(nums.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Sample Input 1
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(6);
        nums1.add(5);
        nums1.add(8);

        System.out.println("Output 1: " + findLonely(nums1)); // [8, 10]

        // Sample Input 2
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(3);
        nums2.add(5);
        nums2.add(3);

        System.out.println("Output 2: " + findLonely(nums2)); // [1, 5]
    }
}
