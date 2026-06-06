package PracticeQns;

import java.util.*;

public class Qns_02 {
    public static void main(String[] args) {

        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Prefix sum 0 exists before array starts
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        int sum = 0;
        int count = 0;

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            if (map.containsKey(sum - k)) {

                ArrayList<Integer> list = map.get(sum - k);

                for (int startIdx : list) {

                    count++;

                    System.out.print("Subarray : ");

                    for (int i = startIdx + 1; i <= j; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(j);
        }

        System.out.println("\nTotal Count = " + count);
    }
}