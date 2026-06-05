//Qns : Given an array of integers, find the number of distinct elements in it.
//Input: arr[] = {1, 2, 3, 2, 4, 1}
//Output: 4 (1, 2, 3, 4 are the distinct elements)

import java.util.*;
public class DistinctEle {
    public static int countDistinct(int[] arr) {
        HashSet<Integer> distinctElements = new HashSet<>();
        for (int num : arr) {
            distinctElements.add(num);
        }
        return distinctElements.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        System.out.println("Number of distinct elements: " + countDistinct(arr));
    }
}
