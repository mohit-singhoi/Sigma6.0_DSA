// BeautiFul ArrayList Problem
// An ArrayList nums of size n is a Beautiful if:
// nums is a permutation of the integers in the range [1,n]
// For every )<=i<j<n, there is no index k with i<k<j where 2*nums.get(k) == nums.get(i)+nums.get(j).
// Given the integer n, return any beautiful arraylist nums of size n. There will be at least  one valid answer for the given n.

// Sample input 1 : n= 4 , Sample output 1 : [2,1,4,3]
// Sample input 2 : n= 5 , Sample output 2 : [3,1,2,5,4]

package PracticeQns;

import java.util.*;

public class Qns_04 {

    public static ArrayList<Integer> beautifulArray(int n) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // base case

        while (result.size() < n) {

            ArrayList<Integer> temp = new ArrayList<>();

            // odd numbers
            for (int x : result) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }

            // even numbers
            for (int x : result) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }

            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> ans = beautifulArray(n);

        System.out.println("Beautiful Array: " + ans);
    }
}
