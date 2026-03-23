// Monotonic ArrayList
// An ArrayList is monotonic if it is either monotone increse or monotone decreasing.
// An ArrayList nums is monotone increasing if for all i<=j,  nums.get(i<=nums.get(j).
// AN ArrayList nums is monotone decreasing if for all i<=j, nums.get(i)>=nums.get(j).
// Given an Integer ArrayList nums, return true if the given List is Monotonic , or false otherwise.
// Sample input 1 : nums =[1,2,2,3] , output = true;
// Sample input 2 : nums =[1,3,2] , output = false;

package PracticeQns;
import java.util.ArrayList;

public class Qns_01 {

    public static boolean monotone(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.size(); i++) {

            if (nums.get(i) < nums.get(i - 1)) {
                increasing = false;
            }

            if (nums.get(i) > nums.get(i - 1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        // Add Elements
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println("Output : " + monotone(nums));
    }
}
